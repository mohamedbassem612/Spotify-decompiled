package p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class htr {
    public final Context a;
    public final ftr b;
    public final SimpleDateFormat c;
    public final DateFormat d;
    public final SimpleDateFormat e;
    public final SimpleDateFormat f;

    public htr(Context context, ftr ftrVar) {
        Locale locale = Locale.getDefault();
        this.a = context;
        this.b = ftrVar;
        this.c = new SimpleDateFormat("d MMM yyyy", locale);
        this.d = DateFormat.getDateInstance(2, locale);
        this.e = new SimpleDateFormat(DateTimePatternGenerator.getInstance(locale).getBestPattern("MMM dd"), locale);
        this.f = new SimpleDateFormat("EEE", locale);
    }

    public final String a(long j) {
        return gtr.a[l1d.C(this.b.a(j))] == 5 ? this.d.format(Long.valueOf(j * 1000)) : this.e.format(Long.valueOf(j * 1000));
    }

    public final String b(long j) {
        int iC = l1d.C(this.b.a(j));
        Context context = this.a;
        if (iC == 0) {
            return context.getString(2131954840);
        }
        if (iC == 1) {
            return context.getString(2131954842);
        }
        if (iC == 2) {
            return context.getString(2131954841);
        }
        if (iC == 3) {
            return this.f.format(Long.valueOf(j * 1000));
        }
        if (iC == 4) {
            return this.e.format(Long.valueOf(j * 1000));
        }
        if (iC == 5) {
            return this.d.format(Long.valueOf(j * 1000));
        }
        eg.o();
        return null;
    }
}
