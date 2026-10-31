package p;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r36 extends q5h {
    public final /* synthetic */ byte b;
    public final rvc0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r36(nma0 nma0Var, byte b) {
        super(nma0Var);
        this.b = b;
        switch (b) {
            case 1:
                super(nma0Var);
                this.c = new p36(nma0Var.getDescriptor(), (byte) 2);
                break;
            default:
                this.c = new p36(nma0Var.getDescriptor(), (byte) 0);
                break;
        }
    }

    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                return ((ArrayList) obj).size();
            default:
                return ((LinkedHashSet) obj).size();
        }
    }

    public final Object g(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                List list = (List) obj;
                obj2 = list instanceof ArrayList ? (ArrayList) list : null;
                return obj2 == null ? new ArrayList(list) : obj2;
            default:
                Set set = (Set) obj;
                obj2 = set instanceof LinkedHashSet ? (LinkedHashSet) set : null;
                return obj2 == null ? new LinkedHashSet(set) : obj2;
        }
    }

    public final h661 getDescriptor() {
        byte b = this.b;
        rvc0 rvc0Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return (p36) rvc0Var;
    }

    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                return (ArrayList) obj;
            default:
                return (LinkedHashSet) obj;
        }
    }

    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((ArrayList) obj).add(i, obj2);
                break;
            default:
                ((LinkedHashSet) obj).add(obj2);
                break;
        }
    }
}
