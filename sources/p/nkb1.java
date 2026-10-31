package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public interface nkb1 {
    static esa1 create() {
        return new esa1(new utw0((byte) 8));
    }

    default mkb1 d(vwl1 vwl1Var) {
        return h(yoi1.z(vwl1Var));
    }

    mkb1 h(uvl1 uvl1Var);

    mkb1 n(uvl1 uvl1Var);

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    static nkb1 m819create() {
        return new utw0((byte) 8);
    }
}
