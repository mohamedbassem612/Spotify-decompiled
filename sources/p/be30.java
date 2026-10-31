package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class be30 {
    public final ArrayList a;
    public final ArrayList b;

    public be30(byte b) {
        switch (b) {
            case 1:
                this.a = new ArrayList(0);
                this.b = new ArrayList(0);
                break;
            default:
                this.a = new ArrayList();
                this.b = new ArrayList();
                break;
        }
    }

    public void a(String str, String str2) {
        this.a.add(mno1.j(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        this.b.add(mno1.j(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public void b(String str, String str2) {
        this.a.add(mno1.j(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
        this.b.add(mno1.j(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
    }

    public ce30 c() {
        return new ce30(this.a, this.b);
    }
}
