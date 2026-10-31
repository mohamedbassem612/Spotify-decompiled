package p;

import com.spotify.profileconfig.proto.v1.AvatarsRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i1b0 implements h0r0 {
    public final a8e0 a;
    public final at7 b;
    public final ge8 c;
    public final cbr0 d;

    public i1b0(a8e0 a8e0Var, at7 at7Var, ge8 ge8Var) {
        this.a = a8e0Var;
        this.b = at7Var;
        this.c = ge8Var;
        dbr0 yxe1Var = new yxe1(new ehc1(""));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("PROFILE_IMAGE_PICKER", "profile/image-picker", 1584, "profile"), nik1.f3, (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        at7 at7Var = this.b;
        String str = (String) at7Var.c;
        int i = at7Var.b;
        Single map = ((i == -1 && ihc1.y0((String) at7Var.d)) ? ((v5n) at7Var.g).b(str).map(qs10.i).map(ws10.t).firstOrError().onErrorReturn(yz10.i) : Single.just(Integer.valueOf(i))).map(new hl00(at7Var, (byte) 22));
        v0x0 v0x0Var = (v0x0) at7Var.e;
        xb9 xb9VarN = AvatarsRequest.n();
        xb9VarN.n(str);
        return a8e0.b(this.a, new m6e0(Single.zip(map, v0x0Var.a((AvatarsRequest) xb9VarN.build()).map(as10.i).map(new eb80(at7Var, (byte) 5)), fj10.i).toObservable().map(ok10.h).startWithItem(h5e0.a).onErrorReturn(sl10.Y), u0e0.X0, fnc0.Z0), new hu90(this, (byte) 22));
    }
}
