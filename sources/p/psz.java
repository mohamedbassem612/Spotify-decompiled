package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum psz implements v190 {
    HTTP_METHOD_UNSPECIFIED(0),
    HTTP_METHOD_GET(1),
    HTTP_METHOD_POST(2),
    HTTP_METHOD_PUT(3),
    HTTP_METHOD_PATCH(4),
    HTTP_METHOD_DELETE(5),
    HTTP_METHOD_HEAD(6),
    HTTP_METHOD_CONNECT(7),
    HTTP_METHOD_OPTIONS(8),
    HTTP_METHOD_TRACE(9),
    UNRECOGNIZED(-1);

    public final int a;

    psz(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
