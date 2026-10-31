package p;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class edv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ edv(hdv hdvVar, byte b) {
        super(1);
        this.a = b;
        this.b = hdvVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        hdv hdvVar = this.b;
        switch (b) {
            case 0:
                return hdvVar.f(null);
            default:
                Parcelable parcelable = (Parcelable) jhc1.t((Bundle) obj, "externalState", ddv.class);
                if (parcelable != null) {
                    return hdvVar.f((ddv) parcelable);
                }
                return null;
        }
    }
}
