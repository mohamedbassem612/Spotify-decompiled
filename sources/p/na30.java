package p;

import android.hardware.camera2.CameraCaptureSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class na30 {
    public final List a;
    public final boolean b;

    public na30(boolean z) {
        this.a = Collections.synchronizedList(new ArrayList());
        this.b = z;
    }

    public static na30 a() {
        return new na30();
    }

    public static na30 b(ArrayList arrayList) {
        return new na30(arrayList);
    }

    public CameraCaptureSession.CaptureCallback c(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.b) {
            return captureCallback;
        }
        b1d b1dVar = new b1d((byte) 3);
        pzc pzcVar = (pzc) b1dVar.b;
        this.a.add(pzcVar);
        pzcVar.b.b(new vqh0((Object) this, (Object) b1dVar, (Object) pzcVar, (byte) 12), n5u.a());
        return new t1d(Arrays.asList(b1dVar, captureCallback));
    }

    public oa30[] d() {
        return (oa30[]) this.a.get(0);
    }

    public n8d0 e() {
        List list = this.a;
        if (list.isEmpty()) {
            return e280.c;
        }
        suc0 suc0Var = new suc0(new ArrayList(new ArrayList(list)), false, n5u.a());
        nkx0 nkx0Var = new nkx0((byte) 24);
        return poz0.F(poz0.J(suc0Var, new mev(nkx0Var, (byte) 20), n5u.a()));
    }

    public int f() {
        return this.b ? 1 : 0;
    }

    public void g() {
        LinkedList linkedList = new LinkedList(this.a);
        while (!linkedList.isEmpty()) {
            n8d0 n8d0Var = (n8d0) linkedList.poll();
            Objects.requireNonNull(n8d0Var);
            n8d0Var.cancel(true);
        }
    }

    public na30(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public na30() {
        this.b = true;
        this.a = Collections.singletonList(null);
    }

    public na30(ArrayList arrayList) {
        this.b = false;
        this.a = arrayList;
    }
}
