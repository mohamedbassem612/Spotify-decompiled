package p;

import com.spotify.listplatform.sortingimpl.ListSortingProto$StoredProvidedSortOrder;
import com.spotify.listplatform.sortingimpl.ListSortingProto$UserSortOrders;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class s3d0 {
    public static final /* synthetic */ mma0[] a = {new cey0(s3d0.class, "listSortingStore", "getListSortingStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1)};
    public static final u4r b;

    static {
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        b = ila0.p("list-sorting-store.pb", c4d0.a, new ze3(l1d0.t, (byte) 3), smo1.e(flo1.l(j0d1VarB, b3s.c)));
    }

    public static final g3d0 a(ListSortingProto$UserSortOrders listSortingProto$UserSortOrders, String str) {
        Map mapO;
        ListSortingProto$StoredProvidedSortOrder listSortingProto$StoredProvidedSortOrder;
        if (listSortingProto$UserSortOrders == null || (mapO = listSortingProto$UserSortOrders.o()) == null || (listSortingProto$StoredProvidedSortOrder = (ListSortingProto$StoredProvidedSortOrder) mapO.get(str)) == null || listSortingProto$StoredProvidedSortOrder.o().length() == 0) {
            return null;
        }
        return listSortingProto$StoredProvidedSortOrder.p() ? new z2d0(listSortingProto$StoredProvidedSortOrder.getName(), listSortingProto$StoredProvidedSortOrder.o(), false) : new a3d0(listSortingProto$StoredProvidedSortOrder.getName(), listSortingProto$StoredProvidedSortOrder.o());
    }
}
