package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ato extends h8n {
    public final Object b(float f, Object obj) {
        if (u890.j(obj, d4o1.a) || obj == null) {
            tyy0 tyy0Var = new tyy0(0.0f);
            obj = new ato(tyy0Var, tyy0Var, tyy0Var, tyy0Var);
        }
        if (!(obj instanceof ato)) {
            return null;
        }
        ato atoVar = (ato) obj;
        k8n k8nVar = ((h8n) atoVar).a;
        cr31 cr31Var = er31.a;
        return new ato(new dr31(f, ((h8n) this).a, k8nVar), new dr31(f, ((h8n) this).b, ((h8n) atoVar).b), new dr31(f, ((h8n) this).c, ((h8n) atoVar).c), new dr31(f, ((h8n) this).d, ((h8n) atoVar).d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ato)) {
            return false;
        }
        ato atoVar = (ato) obj;
        return u890.j(((h8n) this).a, ((h8n) atoVar).a) && u890.j(((h8n) this).b, ((h8n) atoVar).b) && u890.j(((h8n) this).c, ((h8n) atoVar).c) && u890.j(((h8n) this).d, ((h8n) atoVar).d);
    }

    public final int hashCode() {
        return ((h8n) this).d.hashCode() + ((((h8n) this).c.hashCode() + ((((h8n) this).b.hashCode() + (((h8n) this).a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CutCornerShape(topStart = " + ((h8n) this).a + ", topEnd = " + ((h8n) this).b + ", bottomEnd = " + ((h8n) this).c + ", bottomStart = " + ((h8n) this).d + ")";
    }
}
