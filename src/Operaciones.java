public class Operaciones {

    public static int promedio(Calificaciones list[])
    {
        int pro = 0;
        for(int i = 0; i < list.length;i++)
        {
            pro += list[i].calificacion;
        }
        pro /= list.length;
        return pro;
    }
    public static int mayor(Calificaciones list[])
    {
        int may = 0;
        for(int i = 0; i < list.length;i++)
        {
            if(may < list[i].calificacion)
            {
                may = list[i].calificacion;
            }
        }
        return may;
    }
    public static int menor(Calificaciones list[])
    {
        int men = list[0].calificacion;
        for(int i = 0; i < list.length;i++)
        {
            if(men > list[i].calificacion)
            {
                men = list[i].calificacion;
            }
        }
        return men;
    }
}
