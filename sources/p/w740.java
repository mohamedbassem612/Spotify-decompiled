package p;

import com.spotify.extendedmetadata.extensions.gatedentityrelationsimpl.proto.GatedEntityRelations;
import com.spotify.extendedmetadata.extensions.gatedentityrelationsimpl.proto.ValueProp;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w740 implements ov00 {
    public final ez00 a(byte[] bArr) {
        h290<GatedEntityRelations.Entity> h290VarN = GatedEntityRelations.o(bArr).n();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
        for (GatedEntityRelations.Entity entity : h290VarN) {
            String uri = entity.getUri();
            h290 h290VarP = entity.p();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
            Iterator<E> it = h290VarP.iterator();
            while (it.hasNext()) {
                arrayList2.add(new wsi1(((ValueProp) it.next()).n()));
            }
            arrayList.add(new u740(uri, arrayList2, new xsi1(entity.o().p(), entity.o().o()), new fi10(entity.n().getUri(), entity.n().getDescription())));
        }
        return new v740(arrayList);
    }

    public final int b() {
        return 164;
    }

    public final Class type() {
        return v740.class;
    }
}
