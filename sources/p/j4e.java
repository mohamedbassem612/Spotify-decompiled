package p;

import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.castbasic.CastBasicException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j4e {
    public static final j4e c = new j4e(null, null);
    public final String a;
    public final b4e b;

    public j4e(String str, b4e b4eVar) {
        this.a = str;
        this.b = b4eVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connect.castbasic.CastBasicException */
    public final b4e a() throws CastBasicException {
        b4e b4eVar = this.b;
        if (b4eVar == null || !b4eVar.a()) {
            throw new CastBasicException(1, (Exception) null, "Session not found or not connected");
        }
        return b4eVar;
    }

    public final CastDevice b() {
        b4e b4eVar = this.b;
        if (b4eVar == null) {
            return null;
        }
        zod.n("Must be called from the main thread.");
        return b4eVar.k;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d(j4e j4eVar) {
        b4e b4eVar = this.b;
        return b4eVar != null && b4eVar == j4eVar.b;
    }

    public final boolean e() {
        b4e b4eVar = this.b;
        if (b4eVar != null) {
            return b4eVar.a();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4e)) {
            return false;
        }
        j4e j4eVar = (j4e) obj;
        return u890.j(this.a, j4eVar.a) && u890.j(this.b, j4eVar.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connect.castbasic.CastBasicException */
    public final void f() {
        try {
            b4e b4eVarA = a();
            String str = ugl.a;
            zod.n("Must be called from the main thread.");
            arn1 arn1Var = b4eVarA.i;
            if (arn1Var != null) {
                arn1Var.t(str);
            }
        } catch (CastBasicException e) {
            Logger.d("CastBasic->%s", new Object[]{e.getMessage()});
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connect.castbasic.CastBasicException */
    public final void g(iir iirVar) throws CastBasicException {
        b4e b4eVarA = a();
        String str = ugl.a;
        o2e b5j0Var = new b5j0(iirVar);
        zod.n("Must be called from the main thread.");
        arn1 arn1Var = b4eVarA.i;
        if (arn1Var == null || !arn1Var.k()) {
            return;
        }
        arn1Var.s(str, b5j0Var);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b4e b4eVar = this.b;
        return iHashCode + (b4eVar != null ? b4eVar.hashCode() : 0);
    }
}
