package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public interface mp80 extends op80 {
    default mp80 a(np80 np80Var) {
        if (u890.j(getKey(), np80Var)) {
            return this;
        }
        return null;
    }

    np80 getKey();
}
