package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o760 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uoa b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o760(uoa uoaVar, String str, byte b) {
        super(1);
        this.a = b;
        this.b = uoaVar;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        String str = this.c;
        uoa uoaVar = this.b;
        switch (b) {
            case 0:
                uoaVar.h(new o2u0(str, 12, (Map) null), new oot0(0L, 0L, false, false, (hu7) null, (tne1) null, false, 247));
                return new n760(uoaVar, (byte) 0);
            default:
                uoaVar.h(new o2u0(str, 14, (Map) null), new oot0(0L, 0L, false, false, (hu7) null, (tne1) null, false, 247));
                return new n760(uoaVar, (byte) 1);
        }
    }
}
