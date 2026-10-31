package p;

import java.util.LinkedHashMap;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jha0 extends cha0 {
    public String i;
    public boolean t;

    @Override // p.cha0
    public final ega0 o() {
        return new uga0((LinkedHashMap) this.h);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    @Override // p.cha0
    public final void t(String str, ega0 ega0Var) throws SerializationException {
        if (!this.t) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                u890.C("tag");
                throw null;
            }
            linkedHashMap.put(str2, ega0Var);
            this.t = true;
            return;
        }
        if (ega0Var instanceof aha0) {
            this.i = ((aha0) ega0Var).b();
            this.t = false;
        } else {
            if (ega0Var instanceof uga0) {
                throw vvm1.h(xga0.b);
            }
            if (ega0Var instanceof pfa0) {
                throw vvm1.h(sfa0.b);
            }
            eg.o();
        }
    }
}
