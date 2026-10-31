package p;

import com.spotify.pses.v1.proto.AuthMethod;
import com.spotify.pses.v1.proto.Authentication;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import com.spotify.pses.v1.proto.IntentLedLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zeb {
    public final ConfigurationResponse a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public zeb(ConfigurationResponse configurationResponse, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = configurationResponse;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public static void a(ArrayList arrayList, eh8 eh8Var, fh8 fh8Var) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (eh8Var == ((AuthMethod) it.next()).o()) {
                    return;
                }
            }
        }
        ch8 ch8VarQ = AuthMethod.q();
        ch8VarQ.n(eh8Var);
        ch8VarQ.q(fh8Var);
        arrayList.add(ch8VarQ.build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final wab b(IntentLedLayout intentLedLayout) {
        ij8 ij8VarS;
        Authentication authenticationO;
        Authentication authenticationO2;
        Authentication authenticationO3;
        if (((intentLedLayout == null || (authenticationO3 = intentLedLayout.o()) == null) ? 0 : authenticationO3.p()) > 0) {
            intentLedLayout.getClass();
            authenticationO = intentLedLayout.o();
        } else {
            if (intentLedLayout == null || (authenticationO2 = intentLedLayout.o()) == null || (ij8VarS = (ij8) authenticationO2.toBuilder()) == null) {
                ij8VarS = Authentication.s();
            }
            ch8 ch8VarQ = AuthMethod.q();
            ch8VarQ.n(eh8.c);
            fh8 fh8Var = fh8.d;
            ch8VarQ.q(fh8Var);
            ArrayList arrayListO = p7h.O(ch8VarQ.build());
            if (this.b) {
                a(arrayListO, eh8.f, fh8Var);
            }
            boolean z = this.c;
            fh8 fh8Var2 = fh8.c;
            if (z) {
                a(arrayListO, eh8.g, this.d ? fh8Var : fh8Var2);
            }
            if (this.e) {
                a(arrayListO, eh8.d, this.f ? fh8Var : fh8Var2);
            }
            if (this.g) {
                if (!this.h) {
                    fh8Var = fh8Var2;
                }
                a(arrayListO, eh8.h, fh8Var);
            }
            ij8VarS.n(arrayListO);
            authenticationO = (Authentication) ij8VarS.build();
        }
        authenticationO.getClass();
        return new wab(authenticationO, intentLedLayout != null ? intentLedLayout.q() : null, intentLedLayout != null ? intentLedLayout.r() : null, intentLedLayout != null ? intentLedLayout.getName() : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeb)) {
            return false;
        }
        zeb zebVar = (zeb) obj;
        return u890.j(this.a, zebVar.a) && this.b == zebVar.b && this.c == zebVar.c && this.d == zebVar.d && this.e == zebVar.e && this.f == zebVar.f && this.g == zebVar.g && this.h == zebVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
