package p;

import com.spotify.kidssessions.v1.GetAutoLoginTokenRequest;
import com.spotify.kidssessions.v1.GetAutoLoginTokenResponse;
import com.spotify.kidssessions.v1.GetSessionResponse;
import com.spotify.kidssessions.v1.GetTransitioningProfileResponse;
import com.spotify.kidssessions.v1.ParentalConsentSession;
import com.spotify.kidssessions.v1.StartSessionRequest;
import com.spotify.kidssessions.v1.StartSessionResponse;
import com.spotify.kidssessions.v1.TerminateSessionRequest;
import com.spotify.kidssessions.v1.TerminateSessionResponse;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w0g {
    public final d2b0 a;
    public final x2g1 b;

    public w0g(d2b0 d2b0Var, x2g1 x2g1Var) {
        this.a = d2b0Var;
        this.b = x2g1Var;
    }

    public static int d(ci61 ci61Var) {
        int iOrdinal = ci61Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return 2;
            }
            if (iOrdinal == 2) {
                return 3;
            }
            if (iOrdinal == 3) {
                return 4;
            }
            if (iOrdinal == 4) {
                return 5;
            }
            if (iOrdinal != 5) {
                eg.o();
                return 0;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        q0g q0gVar;
        if (onmVar instanceof q0g) {
            q0gVar = (q0g) onmVar;
            int i = q0gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q0gVar.c = i - Integer.MIN_VALUE;
            } else {
                q0gVar = new q0g(this, onmVar);
            }
        } else {
            q0gVar = new q0g(this, onmVar);
        }
        Object objE = q0gVar.a;
        int i2 = q0gVar.c;
        if (i2 == 0) {
            hm5.M(objE);
            cl40 cl40VarO = GetAutoLoginTokenRequest.o();
            cl40VarO.q(this.b.a.a());
            cl40VarO.n(str);
            GetAutoLoginTokenRequest getAutoLoginTokenRequest = (GetAutoLoginTokenRequest) cl40VarO.build();
            q0gVar.c = 1;
            objE = this.a.e(str, getAutoLoginTokenRequest, q0gVar);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objE);
        }
        GetAutoLoginTokenResponse getAutoLoginTokenResponse = (GetAutoLoginTokenResponse) objE;
        return new jv8(getAutoLoginTokenResponse.getUsername(), getAutoLoginTokenResponse.n());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        r0g r0gVar;
        if (onmVar instanceof r0g) {
            r0gVar = (r0g) onmVar;
            int i = r0gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0gVar.c = i - Integer.MIN_VALUE;
            } else {
                r0gVar = new r0g(this, onmVar);
            }
        } else {
            r0gVar = new r0g(this, onmVar);
        }
        Object objB = r0gVar.a;
        int i2 = r0gVar.c;
        if (i2 == 0) {
            hm5.M(objB);
            r0gVar.c = 1;
            objB = this.a.b(str, r0gVar);
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
        ParentalConsentSession parentalConsentSessionN = ((GetSessionResponse) objB).n();
        return new tur0(parentalConsentSessionN.getSessionId(), parentalConsentSessionN.getCreatedAt().q(), parentalConsentSessionN.r().q(), parentalConsentSessionN.p(), parentalConsentSessionN.getChildId(), d(parentalConsentSessionN.q()), parentalConsentSessionN.o());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        s0g s0gVar;
        if (onmVar instanceof s0g) {
            s0gVar = (s0g) onmVar;
            int i = s0gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s0gVar.c = i - Integer.MIN_VALUE;
            } else {
                s0gVar = new s0g(this, onmVar);
            }
        } else {
            s0gVar = new s0g(this, onmVar);
        }
        Object objF = s0gVar.a;
        int i2 = s0gVar.c;
        if (i2 == 0) {
            hm5.M(objF);
            s0gVar.c = 1;
            objF = this.a.f(str, s0gVar);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        GetTransitioningProfileResponse getTransitioningProfileResponse = (GetTransitioningProfileResponse) objF;
        String displayName = getTransitioningProfileResponse.getDisplayName();
        String username = getTransitioningProfileResponse.getUsername();
        String imageUrl = getTransitioningProfileResponse.getImageUrl();
        return new rmg1(displayName, username, imageUrl.length() != 0 ? imageUrl : null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        t0g t0gVar;
        if (onmVar instanceof t0g) {
            t0gVar = (t0g) onmVar;
            int i = t0gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t0gVar.c = i - Integer.MIN_VALUE;
            } else {
                t0gVar = new t0g(this, onmVar);
            }
        } else {
            t0gVar = new t0g(this, onmVar);
        }
        Object objA = t0gVar.a;
        int i2 = t0gVar.c;
        if (i2 == 0) {
            hm5.M(objA);
            kkb1 kkb1VarO = StartSessionRequest.o();
            kkb1VarO.q(this.b.a.a());
            kkb1VarO.n(false);
            StartSessionRequest startSessionRequest = (StartSessionRequest) kkb1VarO.build();
            t0gVar.c = 1;
            objA = this.a.a(startSessionRequest, t0gVar);
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
        ParentalConsentSession parentalConsentSessionN = ((StartSessionResponse) objA).n();
        String sessionId = parentalConsentSessionN.getSessionId();
        long jQ = parentalConsentSessionN.getCreatedAt().q();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new tur0(sessionId, timeUnit.toMillis(jQ), timeUnit.toMillis(parentalConsentSessionN.r().q()), parentalConsentSessionN.p(), parentalConsentSessionN.getChildId(), d(parentalConsentSessionN.q()), parentalConsentSessionN.o());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(onm onmVar) {
        u0g u0gVar;
        if (onmVar instanceof u0g) {
            u0gVar = (u0g) onmVar;
            int i = u0gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u0gVar.c = i - Integer.MIN_VALUE;
            } else {
                u0gVar = new u0g(this, onmVar);
            }
        } else {
            u0gVar = new u0g(this, onmVar);
        }
        Object objD = u0gVar.a;
        int i2 = u0gVar.c;
        if (i2 == 0) {
            hm5.M(objD);
            kkb1 kkb1VarO = StartSessionRequest.o();
            kkb1VarO.q(this.b.a.a());
            kkb1VarO.n(true);
            StartSessionRequest startSessionRequest = (StartSessionRequest) kkb1VarO.build();
            u0gVar.c = 1;
            objD = this.a.d(startSessionRequest, u0gVar);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        ParentalConsentSession parentalConsentSessionN = ((StartSessionResponse) objD).n();
        String sessionId = parentalConsentSessionN.getSessionId();
        long jQ = parentalConsentSessionN.getCreatedAt().q();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new tur0(sessionId, timeUnit.toMillis(jQ), timeUnit.toMillis(parentalConsentSessionN.r().q()), parentalConsentSessionN.p(), parentalConsentSessionN.getChildId(), d(parentalConsentSessionN.q()), parentalConsentSessionN.o());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, onm onmVar) {
        v0g v0gVar;
        if (onmVar instanceof v0g) {
            v0gVar = (v0g) onmVar;
            int i = v0gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v0gVar.c = i - Integer.MIN_VALUE;
            } else {
                v0gVar = new v0g(this, onmVar);
            }
        } else {
            v0gVar = new v0g(this, onmVar);
        }
        Object objC = v0gVar.a;
        int i2 = v0gVar.c;
        if (i2 == 0) {
            hm5.M(objC);
            ayd1 ayd1VarO = TerminateSessionRequest.o();
            ayd1VarO.n(str);
            TerminateSessionRequest terminateSessionRequest = (TerminateSessionRequest) ayd1VarO.build();
            v0gVar.c = 1;
            objC = this.a.c(str, terminateSessionRequest, v0gVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        ParentalConsentSession parentalConsentSessionN = ((TerminateSessionResponse) objC).n();
        return new tur0(parentalConsentSessionN.getSessionId(), parentalConsentSessionN.getCreatedAt().q(), parentalConsentSessionN.r().q(), parentalConsentSessionN.p(), parentalConsentSessionN.getChildId(), d(parentalConsentSessionN.q()), parentalConsentSessionN.o());
    }
}
