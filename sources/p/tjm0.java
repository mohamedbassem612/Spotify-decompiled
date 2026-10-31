package p;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tjm0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<tjm0> CREATOR = new fgm0((byte) 14);
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public tjm0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarA = foi1.a(calendar);
        this.a = calendarA;
        this.b = calendarA.get(2);
        this.c = calendarA.get(1);
        this.d = calendarA.getMaximum(7);
        this.e = calendarA.getActualMaximum(5);
        this.f = calendarA.getTimeInMillis();
    }

    public static tjm0 b(int i, int i2) {
        Calendar calendarC = foi1.c(null);
        calendarC.set(1, i);
        calendarC.set(2, i2);
        return new tjm0(calendarC);
    }

    public static tjm0 g(long j) {
        Calendar calendarC = foi1.c(null);
        calendarC.setTimeInMillis(j);
        return new tjm0(calendarC);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(tjm0 tjm0Var) {
        return this.a.compareTo(tjm0Var.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjm0)) {
            return false;
        }
        tjm0 tjm0Var = (tjm0) obj;
        return this.b == tjm0Var.b && this.c == tjm0Var.c;
    }

    public final int h() {
        Calendar calendar = this.a;
        int firstDayOfWeek = calendar.get(7) - calendar.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.d : firstDayOfWeek;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String j(Context context) {
        String str = this.g;
        if (str != null) {
            return str;
        }
        long timeInMillis = this.a.getTimeInMillis();
        String dateTime = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        this.g = dateTime;
        return dateTime;
    }

    public final int k(tjm0 tjm0Var) {
        if (this.a instanceof GregorianCalendar) {
            return (tjm0Var.b - this.b) + ((tjm0Var.c - this.c) * 12);
        }
        hhg1.n("Only Gregorian calendars are supported.");
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
