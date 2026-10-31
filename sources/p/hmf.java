package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hmf implements j630 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public hmf(HashMap map, zsc zscVar, ObservableEmitter observableEmitter) {
        this.a = (byte) 1;
        this.b = map;
        this.c = observableEmitter;
    }

    public final void a(i430 i430Var) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                fn31.T(((mmf) obj2).O0, (o8n) null, 0, new pid(i430Var, (ven0) obj, (lnm) null, (byte) 8), 3);
                break;
            case 1:
                HashMap map = (HashMap) obj2;
                map.put(i430Var.a, new q730(i430Var.b(), i430Var.c(), i430Var.f(), i430Var.e()));
                ((ObservableEmitter) obj).onNext(map);
                break;
            default:
                ((ssw0) obj2).l(new m3f((w4i1) obj, i430Var.c));
                break;
        }
    }

    public /* synthetic */ hmf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
