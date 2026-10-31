package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ea implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final List b;

    public ea(List list, uqs uqsVar) {
        this.b = list;
    }

    public final Object invoke() {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    a8b0 a8b0VarL = vzn1.l((a8b0) ((e8b0) it.next()));
                    if (a8b0VarL != null) {
                        arrayList.add(a8b0VarL);
                    }
                }
                return arrayList;
            default:
                return list;
        }
    }

    public ea(List list) {
        this.b = list;
    }
}
