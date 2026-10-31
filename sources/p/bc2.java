package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bc2 implements acr0 {
    public static final lik1 b;
    public final Set a = Collections.singleton(blc0.W0);

    static {
        Parcelable.Creator creator = lik1.CREATOR;
        b = oap1.i("spotify:age-assurance");
    }

    public final Set a() {
        return this.a;
    }

    public final Class b() {
        return yb2.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        Object objS = ila0.s(intent, "age_assurance_type", we2.class);
        objS.getClass();
        return new ac2((we2) objS, (Intent) ila0.s(intent, "on_age_assurance_complete_intent", Intent.class));
    }

    public final e6w0 d() {
        return new b6w0(false);
    }

    public final String getDescription() {
        return "Age Assurance flow to let users verify their age.";
    }
}
