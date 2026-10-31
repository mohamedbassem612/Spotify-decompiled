package p;

import com.spotify.share.audioparamstestpage.a;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ay7 implements h0r0 {
    public final qyj a;
    public final a b;
    public final cbr0 c;

    public ay7(qyj qyjVar, a aVar) {
        this.a = qyjVar;
        this.b = aVar;
        dbr0 yxe1Var = new yxe1(new ehc1("Audio params test"));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.c = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.x1(), nik1.o2, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.c;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-281275993, new mu6(this, (byte) 9), true));
    }
}
