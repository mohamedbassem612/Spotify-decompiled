package p;

import android.app.ForegroundServiceStartNotAllowedException;
import androidx.car.app.navigation.model.Maneuver;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException$InvalidWireTypeException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class czh0 implements ezh0, akl, e2i0, c2i0, jgg1, xl70, hc10 {
    public final /* synthetic */ byte a;

    public /* synthetic */ czh0(byte b) {
        this.a = b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.appwidget.protobuf.InvalidProtocolBufferException */
    public static /* synthetic */ void d() throws InvalidProtocolBufferException {
        throw new InvalidProtocolBufferException$InvalidWireTypeException();
    }

    public static /* bridge */ /* synthetic */ boolean f(Object obj) {
        return obj instanceof ForegroundServiceStartNotAllowedException;
    }

    @Override // p.c2i0
    public void a(ffu0 ffu0Var, ixh0 ixh0Var, List list) {
        switch (this.a) {
            case 14:
                ffu0Var.T0(list);
                break;
            default:
                ffu0Var.T0(list);
                break;
        }
    }

    public void accept(Object obj) {
        ffu0 ffu0Var = (ffu0) obj;
        switch (this.a) {
            case 4:
                ffu0Var.d();
                break;
            case 5:
                ffu0Var.a();
                break;
            case 6:
                ffu0Var.R();
                break;
            case 7:
                ffu0Var.f0();
                break;
            case 8:
                ffu0Var.a1();
                break;
            case 9:
                ffu0Var.K();
                break;
            case 10:
                ffu0Var.x();
                break;
            case 11:
            case 14:
            case 15:
            default:
                ffu0Var.s();
                break;
            case 12:
                ffu0Var.Z0();
                break;
            case 13:
                ffu0Var.h0();
                break;
            case 16:
                ffu0Var.A();
                break;
            case 17:
                ffu0Var.stop();
                break;
            case 18:
                ffu0Var.O();
                break;
            case 19:
                ffu0Var.e();
                break;
            case 20:
                ffu0Var.y();
                break;
        }
    }

    public Object apply(Object obj) {
        e9j0 e9j0Var = (e9j0) obj;
        e9j0Var.getClass();
        yqu0 yqu0Var = mhy0.a;
        yqu0Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            yqu0Var.e(e9j0Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public Object b(Object obj, Object obj2) {
        qop qopVar = (qop) obj;
        gl90 gl90Var = (gl90) obj2;
        switch (this.a) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                qopVar.getClass();
                gl90Var.getClass();
                return new b3n0((htp) new itp(qopVar, gl90Var, (byte) 0).c.get());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                qopVar.getClass();
                gl90Var.getClass();
                return new t2n0((ktp) new ltp(gl90Var, (byte) 0).b.get());
            default:
                qopVar.getClass();
                gl90Var.getClass();
                return new b3n0((mtp) new itp(qopVar, gl90Var, (byte) 1).c.get());
        }
    }

    @Override // p.xl70
    public boolean e(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // p.hc10
    public ec10[] g() {
        return new ec10[]{new qpm0(jqc1.o0, 16)};
    }

    public void h(hxh0 hxh0Var, int i) {
        switch (this.a) {
            case 0:
                hxh0Var.getClass();
                break;
            case 1:
                hxh0Var.getClass();
                break;
            default:
                hxh0Var.b(i);
                break;
        }
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        return ((iqh0) fzh0Var).G(ixh0Var);
    }
}
