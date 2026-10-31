package p;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mce1 extends jca implements Handler.Callback {
    public final mhc T0;
    public final gar U0;
    public afo V0;
    public final spc1 W0;
    public boolean X0;
    public byte Y0;
    public rpc1 Z0;
    public bqc1 a1;
    public eae b1;
    public eae c1;
    public int d1;
    public final Handler e1;
    public final hbe1 f1;
    public final w2z g1;
    public boolean h1;
    public boolean i1;
    public ie30 j1;
    public long k1;
    public long l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mce1(hbe1 hbe1Var, Looper looper) {
        Handler handler;
        super(3);
        c681 c681Var = spc1.n0;
        this.f1 = hbe1Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = zoi1.a;
            handler = new Handler(looper, this);
        }
        this.e1 = handler;
        this.W0 = c681Var;
        this.T0 = new mhc((byte) 3);
        this.U0 = new gar(1);
        this.g1 = new w2z((byte) 26);
        this.l1 = -9223372036854775807L;
        this.k1 = -9223372036854775807L;
    }

    @Override // p.jca
    public final void E(ie30[] ie30VarArr, long j, long j2, p2i0 p2i0Var) {
        ie30 ie30Var = ie30VarArr[0];
        this.j1 = ie30Var;
        if (Objects.equals(ie30Var.f66p, "application/x-media3-cues")) {
            this.V0 = this.j1.Q == 1 ? new mvi0() : new g4r((byte) 4);
            return;
        }
        V();
        if (this.Z0 != null) {
            this.Y0 = (byte) 1;
        } else {
            Z();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df A[LOOP:0: B:42:0x00d9->B:44:0x00df, LOOP_END] */
    @Override // p.jca
    public final void I(long j, long j2) {
        boolean z;
        boolean z2;
        long jC;
        gar garVar;
        int iG;
        ArrayList parcelableArrayList;
        v280 v280VarM;
        if (this.N0) {
            long j3 = this.l1;
            if (j3 != -9223372036854775807L && j >= j3) {
                a0();
                this.i1 = true;
            }
        }
        if (this.i1) {
            return;
        }
        ie30 ie30Var = this.j1;
        ie30Var.getClass();
        boolean zEquals = Objects.equals(ie30Var.f66p, "application/x-media3-cues");
        hbe1 hbe1Var = this.f1;
        Handler handler = this.e1;
        boolean zE = false;
        zE = false;
        zE = false;
        zE = false;
        zE = false;
        zE = false;
        zE = false;
        w2z w2zVar = this.g1;
        if (zEquals) {
            this.V0.getClass();
            if (!this.h1 && ((iG = G(w2zVar, (garVar = this.U0), 5)) != -3 || garVar.f(4))) {
                if (iG != -4 || garVar.f(4)) {
                    if (iG == -4 || iG == -3) {
                        long j4 = this.R0;
                        long j5 = j - this.X;
                        if (j4 != -9223372036854775807L && j5 >= j4 - 1000000) {
                            if (G(w2zVar, garVar, 0) == -4) {
                                if (garVar.f(4)) {
                                    this.h1 = true;
                                } else {
                                    garVar.j();
                                    ByteBuffer byteBuffer = garVar.d;
                                    byteBuffer.getClass();
                                    long j6 = garVar.f;
                                    byte[] bArrArray = byteBuffer.array();
                                    int iArrayOffset = byteBuffer.arrayOffset();
                                    int iLimit = byteBuffer.limit();
                                    this.T0.getClass();
                                    Parcel parcelObtain = Parcel.obtain();
                                    parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                                    parcelObtain.setDataPosition(0);
                                    Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                                    parcelObtain.recycle();
                                    parcelableArrayList = bundle.getParcelableArrayList("c");
                                    parcelableArrayList.getClass();
                                    v280VarM = b380.m();
                                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                                        bundle2.getClass();
                                        v280VarM.c(feo.b(bundle2));
                                    }
                                    bfo bfoVar = new bfo(j6, bundle.getLong("d"), v280VarM.g());
                                    garVar.g();
                                    zE = this.V0.e(bfoVar, j);
                                }
                            }
                        }
                    } else if (G(w2zVar, garVar, 0) == -4) {
                        if (garVar.f(4)) {
                            this.h1 = true;
                        } else {
                            garVar.j();
                            ByteBuffer byteBuffer2 = garVar.d;
                            byteBuffer2.getClass();
                            long j7 = garVar.f;
                            byte[] bArrArray2 = byteBuffer2.array();
                            int iArrayOffset2 = byteBuffer2.arrayOffset();
                            int iLimit2 = byteBuffer2.limit();
                            this.T0.getClass();
                            Parcel parcelObtain2 = Parcel.obtain();
                            parcelObtain2.unmarshall(bArrArray2, iArrayOffset2, iLimit2);
                            parcelObtain2.setDataPosition(0);
                            Bundle bundle3 = parcelObtain2.readBundle(Bundle.class.getClassLoader());
                            parcelObtain2.recycle();
                            parcelableArrayList = bundle3.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            v280VarM = b380.m();
                            while (i < parcelableArrayList.size()) {
                                Bundle bundle4 = (Bundle) parcelableArrayList.get(i);
                                bundle4.getClass();
                                v280VarM.c(feo.b(bundle4));
                            }
                            bfo bfoVar2 = new bfo(j7, bundle3.getLong("d"), v280VarM.g());
                            garVar.g();
                            zE = this.V0.e(bfoVar2, j);
                        }
                    }
                } else if (j >= garVar.f - 1000000) {
                    if (G(w2zVar, garVar, 0) == -4) {
                        if (garVar.f(4)) {
                            this.h1 = true;
                        } else {
                            garVar.j();
                            ByteBuffer byteBuffer3 = garVar.d;
                            byteBuffer3.getClass();
                            long j8 = garVar.f;
                            byte[] bArrArray3 = byteBuffer3.array();
                            int iArrayOffset3 = byteBuffer3.arrayOffset();
                            int iLimit3 = byteBuffer3.limit();
                            this.T0.getClass();
                            Parcel parcelObtain3 = Parcel.obtain();
                            parcelObtain3.unmarshall(bArrArray3, iArrayOffset3, iLimit3);
                            parcelObtain3.setDataPosition(0);
                            Bundle bundle5 = parcelObtain3.readBundle(Bundle.class.getClassLoader());
                            parcelObtain3.recycle();
                            parcelableArrayList = bundle5.getParcelableArrayList("c");
                            parcelableArrayList.getClass();
                            v280VarM = b380.m();
                            while (i < parcelableArrayList.size()) {
                                Bundle bundle6 = (Bundle) parcelableArrayList.get(i);
                                bundle6.getClass();
                                v280VarM.c(feo.b(bundle6));
                            }
                            bfo bfoVar3 = new bfo(j8, bundle5.getLong("d"), v280VarM.g());
                            garVar.g();
                            zE = this.V0.e(bfoVar3, j);
                        }
                    }
                }
            }
            long jD = this.V0.d(this.k1);
            if (jD == Long.MIN_VALUE && this.h1 && !zE) {
                this.i1 = true;
            }
            if (jD != Long.MIN_VALUE && jD <= j) {
                zE = true;
            }
            if (zE) {
                b380 b380VarB = this.V0.b(j);
                long jC2 = this.V0.c(j);
                qeo qeoVar = new qeo(Y(jC2), b380VarB);
                if (handler != null) {
                    handler.obtainMessage(1, qeoVar).sendToTarget();
                } else {
                    hbe1Var.l(qeoVar.a);
                    hbe1Var.o(qeoVar);
                }
                this.V0.g(jC2);
            }
            this.k1 = j;
            return;
        }
        V();
        this.k1 = j;
        if (this.c1 == null) {
            rpc1 rpc1Var = this.Z0;
            rpc1Var.getClass();
            rpc1Var.a(j);
            try {
                rpc1 rpc1Var2 = this.Z0;
                rpc1Var2.getClass();
                this.c1 = (eae) rpc1Var2.b();
            } catch (SubtitleDecoderException e) {
                oon1.w("Subtitle decoding failed. streamFormat=" + this.j1, e);
                W();
                a0();
                rpc1 rpc1Var3 = this.Z0;
                rpc1Var3.getClass();
                rpc1Var3.release();
                this.Z0 = null;
                this.Y0 = (byte) 0;
                Z();
                return;
            }
        }
        byte b = 2;
        if (this.h != 2) {
            return;
        }
        if (this.b1 != null) {
            long jX = X();
            z = false;
            while (jX <= j) {
                this.d1++;
                jX = X();
                z = true;
            }
        } else {
            z = false;
        }
        eae eaeVar = this.c1;
        if (eaeVar != null) {
            if (eaeVar.f(4)) {
                if (!z && X() == Long.MAX_VALUE) {
                    if (this.Y0 == 2) {
                        a0();
                        rpc1 rpc1Var4 = this.Z0;
                        rpc1Var4.getClass();
                        rpc1Var4.release();
                        this.Z0 = null;
                        this.Y0 = (byte) 0;
                        Z();
                    } else {
                        a0();
                        this.i1 = true;
                    }
                }
            } else if (eaeVar.b <= j) {
                eae eaeVar2 = this.b1;
                if (eaeVar2 != null) {
                    eaeVar2.h();
                }
                this.d1 = eaeVar.a(j);
                this.b1 = eaeVar;
                this.c1 = null;
                z = true;
            }
        }
        if (z) {
            this.b1.getClass();
            int iA = this.b1.a(j);
            if (iA == 0 || this.b1.d() == 0) {
                jC = this.b1.b;
            } else {
                eae eaeVar3 = this.b1;
                jC = iA == -1 ? eaeVar3.c(eaeVar3.d() - 1) : eaeVar3.c(iA - 1);
            }
            qeo qeoVar2 = new qeo(Y(jC), this.b1.b(j));
            if (handler != null) {
                handler.obtainMessage(1, qeoVar2).sendToTarget();
            } else {
                hbe1Var.l(qeoVar2.a);
                hbe1Var.o(qeoVar2);
            }
        }
        if (this.Y0 == 2) {
            return;
        }
        while (!this.h1) {
            try {
                bqc1 bqc1Var = this.a1;
                if (bqc1Var == null) {
                    rpc1 rpc1Var5 = this.Z0;
                    rpc1Var5.getClass();
                    bqc1Var = (bqc1) rpc1Var5.e();
                    if (bqc1Var == null) {
                        return;
                    } else {
                        this.a1 = bqc1Var;
                    }
                }
                if (this.Y0 == 1) {
                    ((oac) bqc1Var).a = 4;
                    rpc1 rpc1Var6 = this.Z0;
                    rpc1Var6.getClass();
                    rpc1Var6.c(bqc1Var);
                    this.a1 = null;
                    this.Y0 = b;
                    return;
                }
                int iG2 = G(w2zVar, bqc1Var, 5);
                if (iG2 == -3 && !bqc1Var.f(4)) {
                    return;
                }
                if (iG2 != -4 || bqc1Var.f(4)) {
                    if (iG2 == -4 || iG2 == -3) {
                        long j9 = this.R0;
                        long j10 = j - this.X;
                        if (j9 == -9223372036854775807L) {
                            return;
                        }
                        if (j10 < j9 - 1000000) {
                            return;
                        }
                    }
                } else if (j < bqc1Var.f - 1000000) {
                    return;
                }
                int iG3 = G(w2zVar, bqc1Var, 0);
                if (iG3 == -4) {
                    if (bqc1Var.f(4)) {
                        this.h1 = true;
                        this.X0 = false;
                        z2 = false;
                    } else {
                        ie30 ie30Var2 = (ie30) w2zVar.c;
                        if (ie30Var2 == null) {
                            return;
                        }
                        bqc1Var.i = ie30Var2.u;
                        bqc1Var.j();
                        z2 = this.X0 & (!bqc1Var.f(1));
                        this.X0 = z2;
                    }
                    if (!z2) {
                        rpc1 rpc1Var7 = this.Z0;
                        rpc1Var7.getClass();
                        rpc1Var7.c(bqc1Var);
                        this.a1 = null;
                    }
                } else if (iG3 == -3) {
                    return;
                }
                b = 2;
            } catch (SubtitleDecoderException e2) {
                oon1.w("Subtitle decoding failed. streamFormat=" + this.j1, e2);
                W();
                a0();
                rpc1 rpc1Var8 = this.Z0;
                rpc1Var8.getClass();
                rpc1Var8.release();
                this.Z0 = null;
                this.Y0 = (byte) 0;
                Z();
                return;
            }
        }
    }

    @Override // p.jca
    public final int R(ie30 ie30Var) {
        boolean zEquals = Objects.equals(ie30Var.f66p, "application/x-media3-cues");
        String str = ie30Var.f66p;
        if (!zEquals) {
            c681 c681Var = this.W0;
            c681Var.getClass();
            if (!((sjb) c681Var.b).e(ie30Var) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return asj0.n(str) ? jca.a(1, 0, 0, 0) : jca.a(0, 0, 0, 0);
            }
        }
        return jca.a(ie30Var.T == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void V() {
        dm5.B(Objects.equals(this.j1.f66p, "application/cea-608") || Objects.equals(this.j1.f66p, "application/x-mp4-cea-608") || Objects.equals(this.j1.f66p, "application/cea-708"), "Legacy decoding is disabled, can't handle %s samples (expected %s).", this.j1.f66p, "application/x-media3-cues");
    }

    public final void W() {
        w280 w280Var = b380.b;
        qeo qeoVar = new qeo(Y(this.k1), bg11.e);
        Handler handler = this.e1;
        if (handler != null) {
            handler.obtainMessage(1, qeoVar).sendToTarget();
            return;
        }
        bg11 bg11Var = qeoVar.a;
        hbe1 hbe1Var = this.f1;
        hbe1Var.l(bg11Var);
        hbe1Var.o(qeoVar);
    }

    public final long X() {
        if (this.d1 == -1) {
            return Long.MAX_VALUE;
        }
        this.b1.getClass();
        if (this.d1 >= this.b1.d()) {
            return Long.MAX_VALUE;
        }
        return this.b1.c(this.d1);
    }

    public final long Y(long j) {
        dm5.y(j != -9223372036854775807L);
        return j - this.X;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    public final void Z() {
        rpc1 c6tVar;
        byte b = 1;
        this.X0 = true;
        ie30 ie30Var = this.j1;
        ie30Var.getClass();
        sjb sjbVar = (sjb) this.W0.b;
        String str = ie30Var.f66p;
        int i = ie30Var.P;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    c6tVar = new y9e(str, i);
                    break;
                case 2:
                    c6tVar = new cae(i, ie30Var.s);
                    break;
                default:
                    if (sjbVar.e(ie30Var)) {
                        hhg1.n(l1d.m("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    lqc1 lqc1VarH = sjbVar.h(ie30Var);
                    lqc1VarH.getClass().getSimpleName().concat("Decoder");
                    c6tVar = new c6t(lqc1VarH);
                    break;
                    break;
            }
        } else if (sjbVar.e(ie30Var)) {
            hhg1.n(l1d.m("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            lqc1 lqc1VarH2 = sjbVar.h(ie30Var);
            lqc1VarH2.getClass().getSimpleName().concat("Decoder");
            c6tVar = new c6t(lqc1VarH2);
        }
        this.Z0 = c6tVar;
        c6tVar.d(this.Y);
    }

    public final void a0() {
        this.a1 = null;
        this.d1 = -1;
        eae eaeVar = this.b1;
        if (eaeVar != null) {
            eaeVar.h();
            this.b1 = null;
        }
        eae eaeVar2 = this.c1;
        if (eaeVar2 != null) {
            eaeVar2.h();
            this.c1 = null;
        }
    }

    public final void b0(long j) {
        dm5.y(this.N0);
        this.l1 = j;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            bhn0.w();
            return false;
        }
        qeo qeoVar = (qeo) message.obj;
        bg11 bg11Var = qeoVar.a;
        hbe1 hbe1Var = this.f1;
        hbe1Var.l(bg11Var);
        hbe1Var.o(qeoVar);
        return true;
    }

    @Override // p.jca
    public final String i() {
        return "TextRenderer";
    }

    @Override // p.jca
    public final boolean t() {
        return this.i1;
    }

    @Override // p.jca
    public final boolean v() {
        ie30 ie30Var = this.j1;
        if (ie30Var != null) {
            if (!Objects.equals(ie30Var.f66p, "application/x-media3-cues")) {
                if (!this.i1) {
                    if (this.h1) {
                        eae eaeVar = this.b1;
                        long j = this.k1;
                        if (eaeVar == null || eaeVar.d() <= 0 || eaeVar.c(eaeVar.d() - 1) <= j) {
                            eae eaeVar2 = this.c1;
                            long j2 = this.k1;
                            if ((eaeVar2 == null || eaeVar2.d() <= 0 || eaeVar2.c(eaeVar2.d() - 1) <= j2) && this.a1 != null) {
                            }
                        }
                    }
                }
                return false;
            }
            afo afoVar = this.V0;
            afoVar.getClass();
            if (afoVar.d(this.k1) == Long.MIN_VALUE) {
                try {
                    w();
                    return true;
                } catch (IOException unused) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p.jca
    public final void x() {
        this.j1 = null;
        this.l1 = -9223372036854775807L;
        W();
        this.k1 = -9223372036854775807L;
        if (this.Z0 != null) {
            a0();
            rpc1 rpc1Var = this.Z0;
            rpc1Var.getClass();
            rpc1Var.release();
            this.Z0 = null;
            this.Y0 = (byte) 0;
        }
    }

    @Override // p.jca
    public final void z(long j, boolean z, boolean z2) {
        this.k1 = j;
        afo afoVar = this.V0;
        if (afoVar != null) {
            afoVar.clear();
        }
        W();
        this.h1 = false;
        this.i1 = false;
        this.l1 = -9223372036854775807L;
        ie30 ie30Var = this.j1;
        if (ie30Var == null || Objects.equals(ie30Var.f66p, "application/x-media3-cues")) {
            return;
        }
        if (this.Y0 == 0) {
            a0();
            rpc1 rpc1Var = this.Z0;
            rpc1Var.getClass();
            rpc1Var.flush();
            rpc1Var.d(this.Y);
            return;
        }
        a0();
        rpc1 rpc1Var2 = this.Z0;
        rpc1Var2.getClass();
        rpc1Var2.release();
        this.Z0 = null;
        this.Y0 = (byte) 0;
        Z();
    }
}
