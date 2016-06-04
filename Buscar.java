 public void buscar_arreglo(){
        String cod = JOptionPane.showInputDialog("DIGITE EL CONSEGUTIVO A BUSCAR");
        if(cod.equals("") || cod.equals("null")){
            JOptionPane.showMessageDialog(null, "DIGITE UN DATO","OPERACION CANCELAR",JOptionPane.ERROR_MESSAGE);
        }else{
            int consec = Integer.parseInt(cod);
            if(contador > 0){
                for(int i = 0; i < contador; i++){
                    if(user[i].getConsecutivo() == consec){
                        cedula_txt.setText(String.valueOf(user[i].getCedula()));
                        nombre_txt.setText(String.valueOf(user[i].getNombre()));
                        telefono_txt.setText(String.valueOf(user[i].getTelefono()));
                    }
                }
            }else{
            
            }
        }
    }
