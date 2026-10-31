package p;

import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.playlist.proto.a;
import com.spotify.playlist.proto.b;
import java.util.Collections;
import spotify.playlist.esperanto.proto.RootlistModificationRequest;
import spotify.playlist.esperanto.proto.RootlistModificationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o130 implements j130 {
    public final jn7 a;

    public o130(jn7 jn7Var) {
        this.a = jn7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, onm onmVar) {
        k130 k130Var;
        if (onmVar instanceof k130) {
            k130Var = (k130) onmVar;
            int i = k130Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k130Var.d = i - Integer.MIN_VALUE;
            } else {
                k130Var = new k130(this, onmVar);
            }
        } else {
            k130Var = new k130(this, onmVar);
        }
        Object objO = k130Var.b;
        int i2 = k130Var.d;
        if (i2 == 0) {
            hm5.M(objO);
            b bVarR = ModificationRequest.r();
            bVarR.B("create");
            bVarR.C(false);
            bVarR.A(str);
            bVarR.w("start");
            ModificationRequest modificationRequestBuild = bVarR.build();
            jp31 jp31VarN = RootlistModificationRequest.n();
            jp31VarN.q(modificationRequestBuild);
            jp31VarN.n(str2 == null ? "" : str2);
            RootlistModificationRequest rootlistModificationRequestBuild = jp31VarN.build();
            k130Var.a = str2;
            k130Var.d = 1;
            objO = this.a.O(rootlistModificationRequestBuild, k130Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = k130Var.a;
            hm5.M(objO);
        }
        RootlistModificationResponse rootlistModificationResponse = (RootlistModificationResponse) objO;
        return i2x0.l(rootlistModificationResponse.o(), str2 != null ? str2 : "", new l130(rootlistModificationResponse, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar, boolean z) {
        m130 m130Var;
        if (onmVar instanceof m130) {
            m130Var = (m130) onmVar;
            int i = m130Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m130Var.d = i - Integer.MIN_VALUE;
            } else {
                m130Var = new m130(this, onmVar);
            }
        } else {
            m130Var = new m130(this, onmVar);
        }
        Object objO = m130Var.b;
        int i2 = m130Var.d;
        if (i2 == 0) {
            hm5.M(objO);
            b bVarR = ModificationRequest.r();
            bVarR.B("remove");
            bVarR.n(Collections.singletonList(str));
            bVarR.x(z);
            ModificationRequest modificationRequestBuild = bVarR.build();
            jp31 jp31VarN = RootlistModificationRequest.n();
            jp31VarN.q(modificationRequestBuild);
            RootlistModificationRequest rootlistModificationRequestBuild = jp31VarN.build();
            m130Var.a = str;
            m130Var.d = 1;
            objO = this.a.O(rootlistModificationRequestBuild, m130Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = m130Var.a;
            hm5.M(objO);
        }
        return i2x0.l(((RootlistModificationResponse) objO).o(), str, ny00.Y0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, onm onmVar) {
        n130 n130Var;
        if (onmVar instanceof n130) {
            n130Var = (n130) onmVar;
            int i = n130Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                n130Var.d = i - Integer.MIN_VALUE;
            } else {
                n130Var = new n130(this, onmVar);
            }
        } else {
            n130Var = new n130(this, onmVar);
        }
        Object objO = n130Var.b;
        int i2 = n130Var.d;
        if (i2 == 0) {
            hm5.M(objO);
            b bVarR = ModificationRequest.r();
            bVarR.B("set");
            a aVarN = ModificationRequest.Attributes.n();
            aVarN.r(str2);
            bVarR.v(aVarN.build());
            bVarR.r(str);
            ModificationRequest modificationRequestBuild = bVarR.build();
            jp31 jp31VarN = RootlistModificationRequest.n();
            jp31VarN.q(modificationRequestBuild);
            RootlistModificationRequest rootlistModificationRequestBuild = jp31VarN.build();
            n130Var.a = str;
            n130Var.d = 1;
            objO = this.a.O(rootlistModificationRequestBuild, n130Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = n130Var.a;
            hm5.M(objO);
        }
        return i2x0.l(((RootlistModificationResponse) objO).o(), str, ny00.Z0);
    }
}
