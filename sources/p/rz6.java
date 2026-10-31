package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rz6 implements acr0 {
    public final a7a1 a;
    public final Set b;

    public rz6(a7a1 a7a1Var) {
        this.a = a7a1Var;
        this.b = a7a1Var.a ? f46.S0(new blc0[]{blc0.v1, blc0.t2}) : new LinkedHashSet();
    }

    public final Set a() {
        return this.b;
    }

    public final Class b() {
        return mz6.class;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String str;
        Bundle extras;
        blc0 blc0Var = s4b1Var.c;
        String strZ = null;
        Long lValueOf = (!intent.hasExtra("extra_background_color") || (extras = intent.getExtras()) == null) ? null : Long.valueOf(extras.getLong("extra_background_color"));
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal == 45) {
            String strB = s4b1Var.b();
            String str2 = strB == null ? "" : strB;
            String strZ2 = s4b1Var.z();
            String str3 = strZ2 == null ? "" : strZ2;
            String strD = s4b1Var.D();
            return new pz6(str2, str3, strD == null ? "" : strD, z6x.a, lValueOf);
        }
        if (iOrdinal != 95) {
            hhg1.g(blc0Var, "Unsupported link type: ");
            return null;
        }
        String strO = s4b1Var.o(1);
        String strJ = s4b1Var.j();
        if (strO != null) {
            Set set = s4b1.f;
            String strZ3 = uic.c(strO).z();
            if (strZ3 == null) {
                str = "";
            } else {
                str = strZ3;
            }
        } else {
            str = "";
        }
        String strZ4 = s4b1Var.z();
        String str4 = strZ4 == null ? "" : strZ4;
        if (strJ != null) {
            Set set2 = s4b1.f;
            strZ = uic.c(strJ).z();
        }
        List listN = p7h.N(strZ);
        String strD2 = s4b1Var.D();
        return new pz6(str, str4, strD2 == null ? "" : strD2, listN, lValueOf);
    }

    public final String getDescription() {
        return "Blend page for dna";
    }

    public final boolean isEnabled() {
        return this.a.a;
    }
}
