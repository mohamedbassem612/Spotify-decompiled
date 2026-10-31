package p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yzc extends zzc {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yzc(Field field, boolean z, byte b) {
        super(field, z);
        this.e = b;
    }

    @Override // p.i0d
    public void d(Object[] objArr) {
        switch (this.e) {
            case 1:
                super.d(objArr);
                e(f46.k0(objArr));
                break;
            default:
                super.d(objArr);
                break;
        }
    }
}
