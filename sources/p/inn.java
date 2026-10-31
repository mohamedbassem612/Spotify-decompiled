package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class inn extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ knn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ inn(knn knnVar, byte b) {
        super(1);
        this.a = b;
        this.b = knnVar;
    }

    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.a;
        knn knnVar = this.b;
        switch (b) {
            case 0:
                knnVar.f.a.l((Object) null);
                return new rm(knnVar, (byte) 28);
            case 1:
                if (((ehr0) obj) instanceof qy3) {
                    knnVar.a.e();
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                knnVar.f.a.l((Float) obj);
                return rih1.a;
        }
    }
}
