package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hgt implements Function0 {
    public final /* synthetic */ byte a;
    public final jgt b;

    public /* synthetic */ hgt(jgt jgtVar, byte b) {
        this.a = b;
        this.b = jgtVar;
    }

    public final Object invoke() {
        byte b = this.a;
        jgt jgtVar = this.b;
        switch (b) {
            case 0:
                return new igt(jgtVar);
            default:
                return jgtVar.y();
        }
    }
}
