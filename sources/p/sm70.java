package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sm70 extends anm1 {
    public static final sm70 d = new sm70();

    @Override // p.anm1
    public final Object y(Object obj, Object obj2) {
        uqw uqwVar = (uqw) obj;
        uqw uqwVar2 = (uqw) obj2;
        if ((uqwVar instanceof uqw) && (uqwVar2 instanceof uqw)) {
            Object obj3 = uqwVar.c;
            laa laaVar = uqwVar.b;
            Object obj4 = uqwVar2.c;
            boolean z = laaVar == uqwVar2.b;
            boolean zJ = u890.j(obj3 != null ? obj3.getClass() : null, obj4 != null ? obj4.getClass() : null);
            if (z && zJ) {
                return uqwVar2;
            }
            StringBuilder sb = new StringBuilder("DiffUtils identified that " + uqwVar + " and " + uqwVar2 + " ");
            sb.append("are the same type, even though they have props with distinct types\n------------------------------------\n");
            sb.append("Old item props (" + (obj3 != null ? obj3.getClass() : null) + ") = " + obj3);
            sb.append("\n------------------------------------\n");
            sb.append("New item props (" + (obj4 != null ? obj4.getClass() : null) + ") = " + obj4);
            n57.e(sb.toString());
        }
        return null;
    }
}
