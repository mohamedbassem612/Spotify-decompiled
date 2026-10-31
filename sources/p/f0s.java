package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f0s {
    public final void a(fbj0 fbj0Var, zaj0 zaj0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        zaj0 zaj0Var2;
        iu30 iu30Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1971324184);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(fbj0Var) : b0kVar3.i(fbj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(zaj0Var) : b0kVar3.i(zaj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(this) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            FullscreenTemplate.BaseFullscreen baseFullscreenI = p3d1.i(fbj0Var.a);
            es41 es41VarC = l6o1.C(0, 0, 1, b0kVar3);
            float fU0 = ((wat) b0kVar3.k(t4k.h)).U0();
            qim0 qim0VarR = y9j0.r(u291.d(nim0.a, 1.0f), baseFullscreenI, zaj0Var.a, 0.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarR, lhc.g(b0kVar3).f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).b.d;
            float f2 = cbx.b(b0kVar3).b.d;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarN = anm1.N("messaging-fullscreen-base", uyn1.A(qim0VarY, 16.0f, f, 16.0f, f2));
            zaj0Var2 = zaj0Var;
            iu30Var2 = iu30Var;
            j2i j2iVarR = apo.r(1059365742, new d0s(es41VarC, zaj0Var, baseFullscreenI, iu30Var, fU0, this), b0kVar3);
            b0kVar2 = b0kVar3;
            w2g0.c(qim0VarN, (tl3) null, j2iVarR, b0kVar2, 3072, 6);
            boolean z = (i2 & 896) == 256;
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new v5a(iu30Var2, null, (byte) 8);
                b0kVar2.s0(objT);
            }
            BackgroundColor.Companion companion = BackgroundColor.Companion;
            AccessoryContent.Companion companion2 = AccessoryContent.Companion;
            MessageText.Companion companion3 = MessageText.Companion;
            Button.Companion companion4 = Button.Companion;
            Disclaimer.Companion companion5 = Disclaimer.INSTANCE;
            qxd0.s(zaj0Var2, iu30Var2, (vu30) objT, b0kVar2);
        } else {
            b0kVar2 = b0kVar3;
            zaj0Var2 = zaj0Var;
            iu30Var2 = iu30Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, this, fbj0Var, zaj0Var2, iu30Var2, (byte) 3);
        }
    }
}
