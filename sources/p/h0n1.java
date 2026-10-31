package p;

import android.app.PendingIntent;
import android.graphics.Matrix;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.recaptcha.internal.zzad;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h0n1 implements acp1, vy11 {
    public final Object a;

    public h0n1(byte b) {
        switch (b) {
            case 4:
                this.a = new i2i1((byte) 17);
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }

    public void a(long j, long j2, long j3) throws zzad {
        int[] iArr = {2077486715, 1348529152, 196553492, 1547748370, 218381171, -1556364309, 1117142618, 1713258270, 1573363368};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        mdn1 mdn1Var = new mdn1(j, j2, j3);
        ArrayDeque arrayDeque = (ArrayDeque) this.a;
        if (arrayDeque.size() >= (xvj1.i((i2 & (~i)) | i3, (i & i4) | i5, i6, i7) ^ (i8 % 1573363368))) {
            throw new zzad();
        }
        arrayDeque.push(mdn1Var);
    }

    public void accept(Object obj, Object obj2) {
        dqo1 dqo1Var = (dqo1) obj;
        kho1 kho1Var = new kho1((bsd1) obj2, (byte) 1);
        hyl1 hyl1Var = (hyl1) this.a;
        HashMap map = (HashMap) dqo1Var.G.b;
        synchronized (map) {
            try {
                gro1 gro1Var = (gro1) map.remove(hyl1Var);
                if (gro1Var == null) {
                    if (Log.isLoggable("WearableClient", 2)) {
                        new StringBuilder(String.valueOf(hyl1Var).length() + 25);
                    }
                    kho1Var.a(new Status(4002, (String) null, (PendingIntent) null, (lal) null));
                    return;
                }
                gro1Var.b1();
                if (Log.isLoggable("WearableClient", 2)) {
                    new StringBuilder(String.valueOf(hyl1Var).length() + 24);
                }
                xdo1 xdo1VarN = dqo1Var.n();
                deo1 deo1Var = new deo1(map, hyl1Var, kho1Var, (byte) 0);
                qko1 qko1Var = new qko1(gro1Var);
                Parcel parcelA1 = xdo1VarN.a1();
                zsn1.c(parcelA1, deo1Var);
                zsn1.b(parcelA1, qko1Var);
                xdo1VarN.Z0(17, parcelA1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public mdn1 b() {
        return (mdn1) Optional.ofNullable((mdn1) ((ArrayDeque) this.a).peek()).orElseThrow(xcn1.b);
    }

    public Object zza(Object obj) {
        mep1 mep1Var = (mep1) obj;
        return new rzd1(mep1Var.a, mep1Var.b, mep1Var.c, "", (Matrix) this.a);
    }
}
