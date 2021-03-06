package Filmdatenbank;

import java.util.Comparator;

public class FilmTitelAufsteigendComparator implements Comparator<Film>
{
	@Override
	public int compare(Film film1, Film film2)
	{
		if(film2.getTitel() == null && film1.getTitel() == null)
		{
			return 0;
		}
		if(film1.getTitel() == null)
		{
			return 1;
		}
		if(film1.getTitel() == null)
		{
			return -1;
		}
		
		return film1.getTitel().compareTo(film2.getTitel()); //-1 hei�t das zweite Objekt (bier2) ist �bergeordnet, -1 bedeutet das zweite Objekt ist am Ende der Auflistung also unter Z, das erste Objekt ist bei -1 gr��er das zweite kleiner
	}
}
