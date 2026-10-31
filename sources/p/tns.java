package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tns extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zns b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tns(zns znsVar, byte b) {
        super(1);
        this.a = b;
        this.b = znsVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zns znsVar = this.b;
        switch (b) {
            case 0:
                return new sns(znsVar.d, (Set) obj, (byte) 0);
            case 1:
                return new j3r(znsVar.a((gz51) znsVar.b.getValue(), (Map) znsVar.c.getValue()));
            case 2:
                return new xns(znsVar.b, (Set) obj, (byte) 0);
            case 3:
                return new j3r(new u061(((gz51) znsVar.b.getValue()).b.contains((String) obj)));
            case 4:
                return new xns(znsVar.b, (Set) obj, (byte) 1);
            default:
                return new j3r(znsVar.b.getValue());
        }
    }
}
