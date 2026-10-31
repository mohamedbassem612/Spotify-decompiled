package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ks70 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks70(float f, float f2, byte b) {
        super(0);
        this.a = b;
        this.b = f;
        this.c = f2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                break;
        }
        return new drr0((this.b - this.c) / 2.0f);
    }
}
