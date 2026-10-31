package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jnn extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ knn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jnn(knn knnVar, byte b) {
        super(0);
        this.a = b;
        this.b = knnVar;
    }

    public final Object invoke() {
        byte b = this.a;
        knn knnVar = this.b;
        switch (b) {
            case 0:
                knnVar.a.e();
                return Boolean.TRUE;
            default:
                knnVar.a.e();
                return rih1.a;
        }
    }
}
