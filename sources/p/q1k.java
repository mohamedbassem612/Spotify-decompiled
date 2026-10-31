package p;

import com.spotify.mobius.Connection;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q1k implements Connection {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ q1k(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).accept(obj);
                }
                break;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Connection) it2.next()).accept(obj);
                }
                break;
            case 2:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((Connection) it3.next()).accept(obj);
                }
                break;
            case 3:
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((Connection) it4.next()).accept(obj);
                }
                break;
            default:
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((Connection) it5.next()).accept(obj);
                }
                break;
        }
    }

    public final void dispose() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Connection) it.next()).dispose();
                }
                break;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((Connection) it2.next()).dispose();
                }
                break;
            case 2:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((Connection) it3.next()).dispose();
                }
                break;
            case 3:
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    ((Connection) it4.next()).dispose();
                }
                break;
            default:
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((Connection) it5.next()).dispose();
                }
                break;
        }
    }
}
