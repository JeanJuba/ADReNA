   M S B A M L   `   `   `  ����
  ADReNA     ADReNA.View.NewTrainingSet   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � WindowStartupLocation$  CenterScreen=�5   	    � 
ResizeMode$ NoResize=�5   	    � Icon$. (/ADReNA;component/Images/transparent.ico��5   	    � Title$" Novo Conjunto de Treinamento��5   	   $	��380��6.   $	��450��6;   .��5      � $��15q�6    � RowDefinitions 5	   
   �� 5
      $
��Auto �6   �� 5      $��* �6   �� 5      $
��Auto �6   �� 5      $
��Auto �6   .+�5   
   � $��0��6   $��0,0,0,5q�6    5      �� 5      $
��Auto �6    �� 5      $
��Auto �6    �� 5      $
��Auto �6     � ColumnDefinitions 5      �� 5      $
��Auto �6#   �� 5      $
��Auto �6#   .+�5      �� $��0��6   $��0��6!   $��Right=�61   .��6N   Aprendizagem Supervisionada:6l   �� 5      -   5        $��lblSupervisionedLearn��5   1   $��0��6   $��1��6!   6Q   �� 5      $��1��6   $��0��6!   $��Right=�61   .��6N   " Neurônios na camada de entrada:6o   �� 5      -   5        $��lblInputNumber��5   1   $��1��6   $��1��6!   6J   �� 5!      $��2��6   $��0��6!   $��Right=�61   .��6N   !Neurônios na camada de saída:6m   �� 5"      -   5        $��lblOutputNumber��5"   1   $��2��6   $��1��6!   6K   5$      � 5&   
   $��1��6   $��0,0,0,5q�6   .+�5(      &   System.Windows.Controls.DataGrid  -   5        $��PatternDataGrid��5(   '      ColumnWidth5  /System.Windows.Controls.DataGridLengthConverter$ * 6   5)      5+      � 5-   
   $��2��6   $��0,0,0,5q�6   .+�5.      �� ��5/      �� 50       �� TextWrapping$
 Wrap=�6!   $����Observação: Adicione quantos padrões de treinamento desejar; Para criar um novo padrão aperte ENTER; Os padrões só serão aceitos se satifazerem o formato da RNA. Separe os valores de cada neurônio por vírgula, exemplo: 0,0.5,1��65   52      53      � 55   
   $��3��6    56      �� 57      $��* �6#   �� 58      $
��Auto �6#   .+�5;      �� -   5        $��0��5;      $	��100��6%   $��5q�61   $��Right=�6<   .��6p   
Cancelar6z   �� 5<      -   5        $��	btnCreate��5<      $��1��6&   $	��100��66   $��5q�6B   $��Right=�6M   .��6�   Criar6�   5=      5>      5?      