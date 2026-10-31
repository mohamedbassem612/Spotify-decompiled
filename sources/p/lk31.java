package p;

import app.p000rive.AssetsKt;
import app.p000rive.ImageAsset;
import app.p000rive.RememberRiveWorkerKt;
import app.p000rive.Result;
import app.p000rive.RiveFile;
import app.p000rive.RiveFileKt;
import app.p000rive.RiveFileSource;
import app.p000rive.core.CommandQueue;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lk31 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(jk31 jk31Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        ik31 ik31Var = jk31Var.e;
        byte[] bArr = jk31Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1933098570);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(jk31Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.f0(-2013109575, x340Var.K(bArr, ik31Var));
            Object objT = x340Var.T();
            Result<ImageAsset> resultRememberImage = null;
            if (objT == fkj0.X) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            CommandQueue commandQueueRememberRiveWorkerOrNull = RememberRiveWorkerKt.rememberRiveWorkerOrNull(ven0Var, false, false, null, x340Var, 0, 14);
            Throwable th = (Throwable) ven0Var.getValue();
            if (th == null) {
                x340Var.i0(2018302460);
                x340Var.r(false);
            } else {
                x340Var.i0(2018302461);
                ok31.e(th, xi31.WORKER, jk31Var, x340Var, ((i3 << 6) & 896) | 48);
                x340Var.r(false);
            }
            if (commandQueueRememberRiveWorkerOrNull != null) {
                x340Var.i0(2018442054);
                RiveFileSource.Bytes bytesM58boximpl = RiveFileSource.Bytes.m58boximpl(RiveFileSource.Bytes.m59constructorimpl(bArr));
                int i4 = CommandQueue.$stable;
                Result<RiveFile> resultRememberRiveFile = RiveFileKt.rememberRiveFile(bytesM58boximpl, commandQueueRememberRiveWorkerOrNull, x340Var, i4 << 3);
                if (ik31Var == null) {
                    x340Var.i0(2018606880);
                } else {
                    x340Var.i0(2018606881);
                    resultRememberImage = AssetsKt.rememberImage(commandQueueRememberRiveWorkerOrNull, ik31Var.b, x340Var, i4);
                }
                x340Var.r(false);
                Result<ImageAsset> result = resultRememberImage;
                if (resultRememberRiveFile instanceof Result.Loading) {
                    x340Var.i0(-2013090066);
                    x340Var.r(false);
                } else if (resultRememberRiveFile instanceof Result.Error) {
                    x340Var.i0(-2013089129);
                    ok31.e(((Result.Error) resultRememberRiveFile).getThrowable(), xi31.FILE, jk31Var, x340Var, ((i3 << 6) & 896) | 48);
                    x340Var.r(false);
                } else {
                    if (!(resultRememberRiveFile instanceof Result.Success)) {
                        throw p3d1.k(x340Var, -2013091206, false);
                    }
                    x340Var.i0(-2013085357);
                    ok31.c((RiveFile) ((Result.Success) resultRememberRiveFile).getValue(), result, jk31Var, qim0Var, x340Var, (i3 << 6) & 8064);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(2019074392);
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(this, jk31Var, qim0Var, i, (byte) 0);
        }
    }
}
