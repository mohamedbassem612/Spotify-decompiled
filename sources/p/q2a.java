package p;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class q2a extends pim0 implements m7v, j4k {
    public xab1 P0;
    public ContentResolver R0;
    public p2a S0;
    public float O0 = -1.0f;
    public final lw4 Q0 = fdg1.l();

    public final void A1() {
        ContentResolver contentResolver;
        xab1 xab1Var = this.P0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.P0 = null;
        p2a p2aVar = this.S0;
        if (p2aVar != null && (contentResolver = this.R0) != null) {
            contentResolver.unregisterContentObserver(p2aVar);
        }
        this.S0 = null;
        this.R0 = null;
    }

    public final void H1() {
        boolean z;
        xab1 xab1Var = this.P0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.P0 = null;
        if (this.O0 != -1.0f) {
            this.O0 = -1.0f;
            ha71.x(this);
        }
        ContentResolver contentResolver = this.R0;
        if (contentResolver == null) {
            z = false;
        } else {
            z = !(Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) == 0.0f);
        }
        if (z) {
            this.P0 = fn31.T(v1(), (o8n) null, 0, new bu(this, (lnm) null, (byte) 4), 3);
        }
    }

    public final void t0(lsl lslVar) {
        float f = this.O0;
        if (f == -1.0f) {
            lslVar.s1();
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
        float fSqrt = (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
        float f2 = 0.18f * fSqrt;
        float f3 = fIntBitsToFloat * f;
        float f4 = (1.0f - f) * fIntBitsToFloat2;
        float f5 = (-fIntBitsToFloat2) / fSqrt;
        mmr0[] mmr0VarArr = o2a.a;
        float f6 = f5 * f2;
        float f7 = (fIntBitsToFloat / fSqrt) * f2;
        mic0 mic0VarL = v9c.l((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), (((long) Float.floatToRawIntBits(f3 + f6)) << 32) | (((long) Float.floatToRawIntBits(f4 + f7)) & 4294967295L), (((long) Float.floatToRawIntBits(f3 - f6)) << 32) | (((long) Float.floatToRawIntBits(f4 - f7)) & 4294967295L), 0);
        fid fidVarP = lslVar.a1().p();
        fidVarP.j(anm1.g(0L, lslVar.j()), this.Q0);
        lslVar.s1();
        DrawScope.S0(lslVar, mic0VarL, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 9, 62);
        fidVarP.i();
    }

    public final void z1() {
        ContentResolver contentResolver = ((Context) lcc.z(this, AndroidCompositionLocals_androidKt.b)).getContentResolver();
        this.R0 = contentResolver;
        p2a p2aVar = new p2a(this, new Handler(Looper.getMainLooper()), (byte) 0);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("animator_duration_scale"), false, p2aVar);
        this.S0 = p2aVar;
        H1();
    }
}
