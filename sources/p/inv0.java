package p;

import android.content.Context;
import android.content.SharedPreferences;
import j$.time.Clock;
import j$.time.LocalDate;
import j$.time.temporal.ChronoUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class inv0 {
    public final Context a;
    public final SharedPreferences b;
    public final Clock c;
    public final vpv0 d;
    public final vpv0 e;

    public inv0(Context context, vpv0 vpv0Var, vpv0 vpv0Var2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.spotify.music.pam.badge.SeeAllPlans", 0);
        Clock clockSystemUTC = Clock.systemUTC();
        this.a = context;
        this.b = sharedPreferences;
        this.c = clockSystemUTC;
        this.d = vpv0Var;
        this.e = vpv0Var2;
    }

    public final boolean a(boolean z) {
        boolean z2;
        LocalDate localDateNow = LocalDate.now(this.c);
        if (((Boolean) this.e.invoke()).booleanValue()) {
            SharedPreferences sharedPreferences = this.b;
            int i = sharedPreferences.getInt("impression_count", 0);
            boolean z3 = sharedPreferences.getBoolean("interacted", false);
            long epochDay = sharedPreferences.getLong("first_impression_ts", 0L);
            int i2 = sharedPreferences.getInt("last_version", 0);
            int iIntValue = ((Number) this.d.invoke()).intValue();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (iIntValue > i2) {
                editorEdit.putInt("last_version", iIntValue);
                editorEdit.putInt("impression_count", 0);
                editorEdit.putBoolean("interacted", false);
                i = 0;
                z3 = false;
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z3) {
                if (z) {
                    i++;
                    editorEdit.putInt("impression_count", i);
                    if (i == 1) {
                        epochDay = localDateNow.toEpochDay();
                        editorEdit.putLong("first_impression_ts", epochDay);
                    }
                    z2 = true;
                }
                if (z2) {
                    editorEdit.apply();
                }
                if (i != 0) {
                    long jUntil = LocalDate.ofEpochDay(epochDay).until(localDateNow, ChronoUnit.DAYS);
                    boolean z4 = i > 3;
                    boolean z5 = jUntil > 30;
                    if (z4 || z5) {
                    }
                }
                return true;
            }
            if (z2) {
                editorEdit.apply();
                return false;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof inv0) {
            inv0 inv0Var = (inv0) obj;
            return u890.j(this.a, inv0Var.a) && this.b.equals(inv0Var.b) && this.c.equals(inv0Var.c) && this.d == inv0Var.d && this.e == inv0Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + kaa0.f(30, kaa0.f(3, (this.c.hashCode() + ((this.b.hashCode() + (((this.a.hashCode() * 31) + 1977023957) * 31)) * 31)) * 31, 31), 31)) * 31);
    }
}
