package p;

import app.p000rive.Alignment;
import app.p000rive.Artboard;
import app.p000rive.ArtboardKt;
import app.p000rive.ImageAsset;
import app.p000rive.Result;
import app.p000rive.RiveFile;
import app.p000rive.StateMachineKt;
import app.p000rive.ViewModelInstance;
import app.p000rive.ViewModelInstanceKt;
import app.p000rive.ViewModelSource;
import app.p000rive.runtime.kotlin.core.errors.RiveException;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.getkeepsafe.relinker.MissingLibraryException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ok31 {
    public static final void a(v8e0 v8e0Var, ImageAsset imageAsset, jk31 jk31Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        ImageAsset imageAsset2;
        ViewModelInstance viewModelInstance;
        Object dfw0Var;
        jk31 jk31Var2 = jk31Var;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-994690161);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(v8e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(imageAsset) : b0kVar3.i(imageAsset) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(jk31Var2) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        int i3 = i2;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            ik31 ik31Var = jk31Var2.e;
            boolean zG = b0kVar3.g(v8e0Var.d);
            int i4 = i3 & ContentType.LONG_FORM_ON_DEMAND;
            boolean zG2 = zG | (i4 == 32 || ((i3 & 64) != 0 && b0kVar3.g(imageAsset))) | b0kVar3.g(ik31Var);
            Object objT = b0kVar3.T();
            if (zG2 || objT == obj) {
                objT = c13.l(ik31Var == null, b0kVar3);
            }
            tob1 tob1Var = (ven0) objT;
            ViewModelInstance viewModelInstance2 = v8e0Var.d;
            if (ik31Var == null || imageAsset == null || viewModelInstance2 == null) {
                imageAsset2 = imageAsset;
                viewModelInstance = viewModelInstance2;
                b0kVar3.i0(-1834428557);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1834719740);
                String str = ik31Var.a;
                boolean zI = b0kVar3.i(viewModelInstance2) | b0kVar3.i(ik31Var) | (i4 == 32 || ((i3 & 64) != 0 && b0kVar3.i(imageAsset))) | b0kVar3.i(tob1Var) | b0kVar3.i(jk31Var2);
                Object objT2 = b0kVar3.T();
                if (zI || objT2 == obj) {
                    dfw0Var = new dfw0(viewModelInstance2, ik31Var, imageAsset, jk31Var2, tob1Var, (lnm) null);
                    viewModelInstance = viewModelInstance2;
                    jk31Var2 = jk31Var2;
                    tob1Var = tob1Var;
                    imageAsset2 = imageAsset;
                    b0kVar3.s0(dfw0Var);
                } else {
                    dfw0Var = objT2;
                    imageAsset2 = imageAsset;
                    viewModelInstance = viewModelInstance2;
                }
                ViewModelInstance.Companion companion = ViewModelInstance.INSTANCE;
                ImageAsset.Companion companion2 = ImageAsset.INSTANCE;
                qxd0.r(viewModelInstance, imageAsset2, str, (vu30) dfw0Var, b0kVar3);
                b0kVar3.r(false);
            }
            if (((Boolean) tob1Var.getValue()).booleanValue()) {
                b0kVar3.i0(-1834384847);
                boolean z = !jk31Var2.b;
                boolean zG3 = b0kVar3.g(viewModelInstance);
                Object objT3 = b0kVar3.T();
                if (zG3 || objT3 == obj) {
                    objT3 = new mk31(viewModelInstance);
                    b0kVar3.s0(objT3);
                }
                mk31 mk31Var = (mk31) objT3;
                b0kVar2 = b0kVar3;
                b(v8e0Var, viewModelInstance, jk31Var2, qim0Var, b0kVar2, (i3 & 14) | (ViewModelInstance.$stable << 3) | (i3 & 896) | (i3 & 7168));
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zI2 = b0kVar2.i(mk31Var) | b0kVar2.h(z);
                Object objT4 = b0kVar2.T();
                if (zI2 || objT4 == obj) {
                    objT4 = new ic01(mk31Var, z, (lnm) null, (byte) 16);
                    b0kVar2.s0(objT4);
                }
                qxd0.s(mk31Var, boolValueOf, (vu30) objT4, b0kVar2);
                boolean zI3 = b0kVar2.i(jk31Var2);
                Object objT5 = b0kVar2.T();
                if (zI3 || objT5 == obj) {
                    objT5 = new kdt0(jk31Var2, (lnm) null, (byte) 16);
                    b0kVar2.s0(objT5);
                }
                ImageAsset.Companion companion3 = ImageAsset.INSTANCE;
                qxd0.s(v8e0Var, imageAsset2, (vu30) objT5, b0kVar2);
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.i0(-1833706381);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(i, v8e0Var, imageAsset, jk31Var2, qim0Var, (byte) 29);
        }
    }

    public static final void b(v8e0 v8e0Var, ViewModelInstance viewModelInstance, jk31 jk31Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1549840160);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(v8e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(viewModelInstance) : b0kVar3.i(viewModelInstance) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(jk31Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = b0kVar3.i(ven0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new r9y0(ven0Var, (byte) 10);
                b0kVar3.s0(objT2);
            }
            b0kVar2 = b0kVar3;
            w2g0.c(lrn1.u(qim0Var, (iu30) objT2), (tl3) null, apo.r(-1496946314, new kj21(v8e0Var, jk31Var, viewModelInstance, ven0Var, (byte) 3), b0kVar3), b0kVar2, 3072, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, v8e0Var, viewModelInstance, jk31Var, qim0Var, (byte) 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(RiveFile riveFile, Result result, jk31 jk31Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1635182436);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(riveFile) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(result) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jk31Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            Artboard artboardRememberArtboard = ArtboardKt.rememberArtboard(riveFile, null, x340Var, i3, 2);
            d(new v8e0(riveFile, artboardRememberArtboard, StateMachineKt.rememberStateMachine(artboardRememberArtboard, null, x340Var, Artboard.$stable, 2), ViewModelInstanceKt.rememberViewModelInstance(riveFile, ViewModelSource.DefaultForArtboard.m161defaultInstanceimpl(ViewModelSource.DefaultForArtboard.m160constructorimpl(artboardRememberArtboard)), x340Var, i3, 0)), result, jk31Var, qim0Var, x340Var, i2 & 8176);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, riveFile, result, jk31Var, qim0Var, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(v8e0 v8e0Var, Result result, jk31 jk31Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1871916055);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(v8e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(result) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jk31Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (result == null) {
            x340Var.i0(679975429);
            a(v8e0Var, null, jk31Var, qim0Var, x340Var, (i2 & 14) | 48 | (i2 & 896) | (i2 & 7168));
            x340Var.r(false);
        } else if (result instanceof Result.Loading) {
            x340Var.i0(679977901);
            x340Var.r(false);
        } else if (result instanceof Result.Error) {
            x340Var.i0(679978644);
            e(((Result.Error) result).getThrowable(), xi31.IMAGE, jk31Var, x340Var, (i2 & 896) | 48);
            x340Var.r(false);
        } else {
            if (!(result instanceof Result.Success)) {
                throw p3d1.k(x340Var, 679974617, false);
            }
            x340Var.i0(679981650);
            a(v8e0Var, (ImageAsset) ((Result.Success) result).getValue(), jk31Var, qim0Var, x340Var, (i2 & 14) | (ImageAsset.$stable << 3) | (i2 & 896) | (i2 & 7168));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, v8e0Var, result, jk31Var, qim0Var, (byte) 2);
        }
    }

    public static final void e(Throwable th, xi31 xi31Var, jk31 jk31Var, b0k b0kVar, int i) {
        int i2;
        Throwable th2;
        xi31 xi31Var2;
        jk31 jk31Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(383123482);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(th) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(xi31Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(jk31Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(th) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | x340Var.i(jk31Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                th2 = th;
                xi31Var2 = xi31Var;
                jk31Var2 = jk31Var;
                i3y0 i3y0Var = new i3y0(th2, xi31Var2, jk31Var2, (lnm) null, (byte) 17);
                x340Var.s0(i3y0Var);
                objT = i3y0Var;
            } else {
                th2 = th;
                xi31Var2 = xi31Var;
                jk31Var2 = jk31Var;
            }
            qxd0.s(th2, xi31Var2, (vu30) objT, x340Var);
        } else {
            th2 = th;
            xi31Var2 = xi31Var;
            jk31Var2 = jk31Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(th2, xi31Var2, jk31Var2, false, i, (byte) 1);
        }
    }

    public static final void f(Throwable th, xi31 xi31Var, jk31 jk31Var) {
        String strM;
        int length = jk31Var.a.length;
        ik31 ik31Var = jk31Var.e;
        StringBuilder sb = new StringBuilder(gvg.e(length, " Rive file size: ", " bytes."));
        if (ik31Var != null) {
            sb.append(" Image path: " + ik31Var.a + "; image size: " + ik31Var.b.length + " bytes.");
        }
        String string = sb.toString();
        xi31 xi31Var2 = xi31.FILE;
        if (xi31Var == xi31Var2 && (th instanceof RiveException)) {
            strM = "Invalid or corrupted Rive file data.";
        } else if (th instanceof UnsatisfiedLinkError) {
            strM = "Native library not loaded; Rive initialization may have failed.";
        } else if (th instanceof MissingLibraryException) {
            strM = "Required native library is missing.";
        } else if (th instanceof IllegalArgumentException) {
            strM = l1d.m("Invalid arguments. Error: ", th.getMessage());
        } else if (th instanceof OutOfMemoryError) {
            strM = "Out of memory; consider reducing animation complexity.";
        } else {
            strM = (xi31Var == xi31.WORKER || xi31Var == xi31Var2) ? "Unexpected error; this may indicate a failure in Rive native code." : "Unexpected error.";
        }
        n57.t(cy30.p("Failed to ", xi31Var.a, ": ", strM, string), th);
        jk31Var.g.invoke(th);
    }

    public static final Alignment g(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return Alignment.TopCenter;
        }
        if (iC == 1) {
            return Alignment.Center;
        }
        if (iC == 2) {
            return Alignment.BottomCenter;
        }
        eg.o();
        return null;
    }
}
