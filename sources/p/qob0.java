package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qob0 extends hab0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qob0(int i, float f, float f2) {
        super(0);
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final Object invoke() {
        return new pob0(this.a, this.b, this.c);
    }
}
