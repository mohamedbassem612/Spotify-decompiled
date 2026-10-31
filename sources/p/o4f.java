package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o4f extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p4f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o4f(p4f p4fVar, byte b) {
        super(0);
        this.a = b;
        this.b = p4fVar;
    }

    public final Object invoke() {
        byte b = this.a;
        p4f p4fVar = this.b;
        switch (b) {
            case 0:
                return new xuk0(new yuk0(new bqk0(p4fVar.a, (byte) 22)));
            default:
                return new avk0(new nqk0(new bqk0(p4fVar.a, (byte) 22), (char) 0));
        }
    }
}
