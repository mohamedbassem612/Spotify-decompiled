package p;

import com.spotify.personalizedepisodes.contentservice.v1.GetUserLocationResponse;
import com.spotify.personalizedepisodes.contentservice.v1.LocationSuggestion;
import com.spotify.personalizedepisodes.contentservice.v1.SuggestLocationsResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class whe0 {
    public final coe0 a;

    public whe0(coe0 coe0Var) {
        this.a = coe0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        uhe0 uhe0Var;
        tdi1 m231Var;
        if (onmVar instanceof uhe0) {
            uhe0Var = (uhe0) onmVar;
            int i = uhe0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uhe0Var.c = i - Integer.MIN_VALUE;
            } else {
                uhe0Var = new uhe0(this, onmVar);
            }
        } else {
            uhe0Var = new uhe0(this, onmVar);
        }
        Object objA = uhe0Var.a;
        int i2 = uhe0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                coe0 coe0Var = this.a;
                uhe0Var.c = 1;
                objA = coe0Var.a(uhe0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            sy21 sy21Var = (sy21) objA;
            if (!sy21Var.a.Q0) {
                throw new HttpException(sy21Var);
            }
            Object obj = sy21Var.b;
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            GetUserLocationResponse getUserLocationResponse = (GetUserLocationResponse) obj;
            m231Var = new tdi1(getUserLocationResponse.o(), getUserLocationResponse.p(), getUserLocationResponse.getDisplayName(), getUserLocationResponse.getName(), getUserLocationResponse.n());
            Throwable thA = e331.a(m231Var);
            if (thA == null || !(thA instanceof CancellationException)) {
                return m231Var;
            }
            throw thA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(String str, onm onmVar) {
        vhe0 vhe0Var;
        ArrayList m231Var;
        if (onmVar instanceof vhe0) {
            vhe0Var = (vhe0) onmVar;
            int i = vhe0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vhe0Var.c = i - Integer.MIN_VALUE;
            } else {
                vhe0Var = new vhe0(this, onmVar);
            }
        } else {
            vhe0Var = new vhe0(this, onmVar);
        }
        Object objB = vhe0Var.a;
        int i2 = vhe0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objB);
                coe0 coe0Var = this.a;
                vhe0Var.c = 1;
                objB = coe0Var.b(str, vhe0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
            }
            sy21 sy21Var = (sy21) objB;
            if (!sy21Var.a.Q0) {
                throw new HttpException(sy21Var);
            }
            Object obj = sy21Var.b;
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            h290<LocationSuggestion> h290VarN = ((SuggestLocationsResponse) obj).n();
            m231Var = new ArrayList(q7h.U(h290VarN, 10));
            for (LocationSuggestion locationSuggestion : h290VarN) {
                m231Var.add(new aoe0(locationSuggestion.o(), locationSuggestion.getName(), locationSuggestion.n()));
            }
            Throwable thA = e331.a(m231Var);
            if (thA == null || !(thA instanceof CancellationException)) {
                return m231Var;
            }
            throw thA;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
    }
}
