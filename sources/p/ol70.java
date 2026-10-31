package p;

import androidx.compose.ui.graphics.ColorFilter;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ol70 {
    public static final kiv a = new kiv(new el70((byte) 0), (byte) 0);

    public static final void a(jmr0 jmr0Var, x9h x9hVar, String str, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-147534442);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(jmr0Var) : x340Var.i(jmr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(x9hVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = (i2 & 14) | 56;
            int i4 = i2 << 3;
            b(jmr0Var, x9hVar, str, qim0Var, x340Var, (i4 & 57344) | i3 | (i4 & 896) | (i4 & 7168));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new il70(jmr0Var, x9hVar, str, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(jmr0 jmr0Var, x9h x9hVar, String str, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1613463054);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(jmr0Var) : x340Var.i(jmr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(x9hVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str) ? 2048 : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            yk70 yk70VarB = nim0.a;
            yk70 yk70Var = x9hVar != null ? new yk70(x9hVar, jmr0Var) : yk70VarB;
            if (str != null) {
                x340Var.i0(-1698340206);
                boolean z = (i2 & 7168) == 2048;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new jfa(str, (byte) 7);
                    x340Var.s0(objT);
                }
                yk70VarB = s161.b(yk70VarB, false, (iu30) objT);
                x340Var.r(false);
            } else {
                x340Var.i0(-1698181424);
                x340Var.r(false);
            }
            t1c.a(xyn1.s(u291.r(qim0Var, ((p3v) x340Var.k(a)).a).then(yk70Var), jmr0Var, (tl3) null, mif1.Q0, 0.0f, (ColorFilter) null, 54).then(yk70VarB), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new il70(jmr0Var, x9hVar, str, qim0Var, i, (byte) 1);
        }
    }

    public static final void c(final b180 b180Var, final long j, String str, qim0 qim0Var, b0k b0kVar, final int i) {
        int i2;
        final qim0 qim0Var2;
        final String str2;
        Function0 function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1208815319);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(b180Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            dui1 dui1VarS = byo1.s(b180Var, x340Var);
            if (j != 16) {
                x340Var.i0(-1483367325);
                boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new ll70(j);
                    x340Var.s0(objT);
                }
                function0 = (Function0) objT;
                x340Var.r(false);
            } else {
                x340Var.i0(-1483322810);
                x340Var.r(false);
                function0 = null;
            }
            a(dui1VarS, function0 != null ? new ml70(function0, (byte) 0) : null, str, qim0Var, x340Var, (i2 & 896) | 8 | (i2 & 7168));
            str2 = str;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.gl70
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ol70.c(b180Var, j, str2, qim0Var2, (b0k) obj, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }
}
