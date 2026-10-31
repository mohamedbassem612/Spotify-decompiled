package p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c0d extends d0d {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0d(Field field, boolean z, boolean z2, byte b) {
        super(field, z, z2);
        this.g = b;
    }

    @Override // p.d0d, p.i0d
    public void d(Object[] objArr) {
        switch (this.g) {
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
