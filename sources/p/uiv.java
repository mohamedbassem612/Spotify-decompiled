package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uiv extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uiv(List list, byte b) {
        super(1);
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((Number) obj).intValue() == list.size());
            default:
                return Boolean.valueOf(((wge1) list.get(((Number) obj).intValue())).b());
        }
    }
}
