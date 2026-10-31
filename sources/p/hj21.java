package p;

import android.content.Intent;
import android.os.Parcelable;
import com.spotify.martini.martinidata.model.Mode;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hj21 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;
    public final Object c;
    public final Object d;
    public final Object e;

    public hj21(sv4 sv4Var, mr4 mr4Var, uh4 uh4Var) {
        this.a = (byte) 0;
        this.c = sv4Var;
        this.d = mr4Var;
        this.e = uh4Var;
        this.b = dm61.z0(blc0.MARTINI_REPORT_A_PROBLEM, blc0.SONG_DNA_FEEDBACK_CREDITS, blc0.SONG_DNA_FEEDBACK_SAMPLES, blc0.SONG_DNA_FEEDBACK_OTHER);
    }

    public static fj21 f(s4b1 s4b1Var, Mode mode) {
        lik1 lik1Var;
        String strO = s4b1Var.o(2);
        if (strO == null) {
            strO = "";
        }
        String strConcat = "spotify:track:".concat(strO);
        String strZ = s4b1Var.z();
        if (strZ == null) {
            strZ = "";
        }
        String strN = s4b1Var.n("viewUri");
        if (strN == null || strN.length() == 0) {
            lik1Var = new lik1("");
        } else {
            Parcelable.Creator<lik1> creator = lik1.CREATOR;
            lik1Var = oap1.i(strN);
        }
        return new fj21(strConcat, strZ, lik1Var, mode);
    }

    @Override // p.acr0
    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    @Override // p.acr0
    public final Class b() {
        switch (this.a) {
            case 0:
                return bj21.class;
            default:
                return f4j1.class;
        }
    }

    @Override // p.acr0
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        lik1 lik1Var;
        Mode modeValueOf;
        switch (this.a) {
            case 0:
                switch (s4b1Var.c.ordinal()) {
                    case 888:
                        return f(s4b1Var, Mode.SONG_DNA_CREDITS);
                    case 889:
                        return f(s4b1Var, Mode.SONG_DNA_OTHER);
                    case 890:
                        return f(s4b1Var, Mode.SONG_DNA_SAMPLES);
                    default:
                        String strJ = s4b1Var.j();
                        if (strJ == null) {
                            strJ = "";
                        }
                        String strZ = s4b1Var.z();
                        if (strZ == null) {
                            strZ = "";
                        }
                        String strN = s4b1Var.n("viewUri");
                        if (strN == null || strN.length() == 0) {
                            lik1Var = new lik1("");
                        } else {
                            Parcelable.Creator<lik1> creator = lik1.CREATOR;
                            lik1Var = oap1.i(strN);
                        }
                        String strN2 = s4b1Var.n("mode");
                        if (strN2 == null || (modeValueOf = Mode.valueOf(strN2)) == null) {
                            modeValueOf = Mode.MARTINI;
                        }
                        return new fj21(strJ, strZ, lik1Var, modeValueOf);
                }
            default:
                return aqr0.a;
        }
    }

    @Override // p.acr0
    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            default:
                return bin.s(new c6w0(1, false, (hd5) null, 14));
        }
    }

    @Override // p.acr0
    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Page for reporting problems with Martini content";
            default:
                return "Blocking dialog to inform users about expired app versions";
        }
    }

    @Override // p.acr0
    public final boolean isEnabled() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return ((sv4) obj3).a() || ((mr4) obj2).j() || ((uh4) obj).d();
            default:
                return (((Boolean) ((kly0) obj3).get()).booleanValue() && ((Boolean) ((kly0) obj2).get()).booleanValue()) || ((Boolean) ((kly0) obj).get()).booleanValue();
        }
    }

    public hj21(gbp gbpVar, gbp gbpVar2, gbp gbpVar3) {
        this.a = (byte) 1;
        this.c = gbpVar;
        this.d = gbpVar2;
        this.e = gbpVar3;
        this.b = Collections.singleton(blc0.VERSION_SUNSETTING_BLOCKING);
    }
}
