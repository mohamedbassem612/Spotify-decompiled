package p;

import com.spotify.kidsview.v1.proto.Child;
import com.spotify.kidsview.v1.proto.GenAlphaManagedSettings;
import com.spotify.kidsview.v1.proto.GetChildrenResponse;
import com.spotify.kidsview.v1.proto.GetDeleteManagedAccountViewResponse;
import com.spotify.kidsview.v1.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.v1.proto.TransitionToManagedAccountRequest;
import com.spotify.kidsview.v1.proto.TransitionToManagedAccountResponse;
import com.spotify.kidsview.v2.proto.GetParentOrGuardianViewResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k2b0 implements e2b0 {
    public final o2b0 a;

    public k2b0(o2b0 o2b0Var) {
        this.a = o2b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(onm onmVar) {
        f2b0 f2b0Var;
        if (onmVar instanceof f2b0) {
            f2b0Var = (f2b0) onmVar;
            int i = f2b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2b0Var.c = i - Integer.MIN_VALUE;
            } else {
                f2b0Var = new f2b0(this, onmVar);
            }
        } else {
            f2b0Var = new f2b0(this, onmVar);
        }
        Object objA = f2b0Var.a;
        int i2 = f2b0Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            f2b0Var.c = 1;
            objA = this.a.a(f2b0Var);
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
        List childrenList = ((GetChildrenResponse) objA).getChildrenList();
        ArrayList<Child> arrayList = new ArrayList();
        for (Object obj : childrenList) {
            if (((Child) obj).getProfile().getAllowedInMusicApp()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (Child child : arrayList) {
            arrayList2.add(new gzf(yah0.p(child.getProfile().getColor().getValue()), child.getChildId(), child.getProfile().getName(), child.getImageUri().getValue(), child.getProfile().getDateOfBirth(), false, child.getIsFree()));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        g2b0 g2b0Var;
        if (onmVar instanceof g2b0) {
            g2b0Var = (g2b0) onmVar;
            int i = g2b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g2b0Var.c = i - Integer.MIN_VALUE;
            } else {
                g2b0Var = new g2b0(this, onmVar);
            }
        } else {
            g2b0Var = new g2b0(this, onmVar);
        }
        Object objB = g2b0Var.a;
        int i2 = g2b0Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            g2b0Var.c = 1;
            objB = this.a.b(str, g2b0Var);
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
        return yon1.z5((GetDeleteManagedAccountViewResponse) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        h2b0 h2b0Var;
        if (onmVar instanceof h2b0) {
            h2b0Var = (h2b0) onmVar;
            int i = h2b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h2b0Var.c = i - Integer.MIN_VALUE;
            } else {
                h2b0Var = new h2b0(this, onmVar);
            }
        } else {
            h2b0Var = new h2b0(this, onmVar);
        }
        Object objG = h2b0Var.a;
        int i2 = h2b0Var.c;
        if (i2 == 0) {
            hm5.M(objG);
            h2b0Var.c = 1;
            objG = this.a.g(str, h2b0Var);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objG);
        }
        return yon1.A5((GetManagedAccountDetailsViewResponse) objG);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(onm onmVar) {
        i2b0 i2b0Var;
        if (onmVar instanceof i2b0) {
            i2b0Var = (i2b0) onmVar;
            int i = i2b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i2b0Var.c = i - Integer.MIN_VALUE;
            } else {
                i2b0Var = new i2b0(this, onmVar);
            }
        } else {
            i2b0Var = new i2b0(this, onmVar);
        }
        Object objE = i2b0Var.a;
        int i2 = i2b0Var.c;
        if (i2 == 0) {
            hm5.M(objE);
            i2b0Var.c = 1;
            objE = this.a.e(i2b0Var);
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
        return etr0.a((GetParentOrGuardianViewResponse) objE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(yig1 yig1Var, String str, String str2, boolean z, boolean z2, String str3, onm onmVar) {
        j2b0 j2b0Var;
        if (onmVar instanceof j2b0) {
            j2b0Var = (j2b0) onmVar;
            int i = j2b0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j2b0Var.c = i - Integer.MIN_VALUE;
            } else {
                j2b0Var = new j2b0(this, onmVar);
            }
        } else {
            j2b0Var = new j2b0(this, onmVar);
        }
        Object objC = j2b0Var.a;
        int i2 = j2b0Var.c;
        if (i2 == 0) {
            hm5.M(objC);
            TransitionToManagedAccountRequest.Builder builderNewBuilder = TransitionToManagedAccountRequest.newBuilder();
            if (yig1Var instanceof xig1) {
                builderNewBuilder.setParentalConsentSessionId(((xig1) yig1Var).getValue());
            } else {
                if (!(yig1Var instanceof wig1)) {
                    eg.o();
                    return null;
                }
                builderNewBuilder.setMemberId(((wig1) yig1Var).getValue());
            }
            if (str3 != null) {
                int i3 = hu50.a;
                builderNewBuilder.setParentPinHash(gu50.a.F(str3, nne.a).toString());
            }
            TransitionToManagedAccountRequest transitionToManagedAccountRequest = (TransitionToManagedAccountRequest) builderNewBuilder.setSettings(GenAlphaManagedSettings.newBuilder().setDisplayName(str).setDateOfBirth(str2).setAllowExplicitContent(z).setAllowVideoContent(z2).build()).build();
            transitionToManagedAccountRequest.getClass();
            j2b0Var.c = 1;
            objC = this.a.c(transitionToManagedAccountRequest, j2b0Var);
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
        TransitionToManagedAccountResponse transitionToManagedAccountResponse = (TransitionToManagedAccountResponse) objC;
        return new oeg0(transitionToManagedAccountResponse.getTimeout().p(), transitionToManagedAccountResponse.getMigrationId());
    }
}
