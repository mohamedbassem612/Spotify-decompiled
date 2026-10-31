package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jf2 implements acr0 {
    public static final lik1 b;
    public final Set a = Collections.singleton(blc0.Z0);

    static {
        Parcelable.Creator creator = lik1.CREATOR;
        b = oap1.i("spotify:age-assurance:underage:blocking");
    }

    public final Set a() {
        return this.a;
    }

    public final Class b() {
        return af2.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Object next;
        Bundle extras = intent.getExtras();
        Integer num = null;
        String string = extras != null ? extras.getString("age_assurance_state") : null;
        Iterator it = h8b.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((h8b) next).name(), string != null ? string.toUpperCase(Locale.ROOT) : null));
        h8b h8bVar = (h8b) next;
        if (h8bVar == null) {
            hhg1.o(string, "Invalid value for age_assurance_state: ");
            return null;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            int i = extras2.getInt("days_left", -1);
            Integer numValueOf = Integer.valueOf(i);
            if (i >= 0) {
                num = numValueOf;
            }
        }
        Bundle extras3 = intent.getExtras();
        return new if2(h8bVar, num, extras3 != null ? extras3.getBoolean("block_navigation", true) : true);
    }

    public final e6w0 d() {
        return bin.s(new c6w0(1, false, (hd5) null, 14));
    }

    public final String getDescription() {
        return "An age assurance blocking dialog telling the user their account is blocked due to being underage.";
    }
}
