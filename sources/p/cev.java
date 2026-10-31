package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cev {
    public final boolean a;

    public cev(boolean z) {
        this.a = z;
    }

    public static int a(YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo, clc0 clc0Var) {
        Object next;
        Iterator it = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.y().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) next).h() != clc0Var);
        YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType numberOfItemsForLinkType = (YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) next;
        if (numberOfItemsForLinkType != null) {
            return numberOfItemsForLinkType.i();
        }
        return 0;
    }

    public static int b(YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo, Set set) {
        h290 h290VarY = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.y();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h290VarY) {
            if (set.contains(((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) obj).h())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it.next()).i();
        }
        return i;
    }

    public static boolean c(YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo) {
        Iterator it = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.y().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType) it.next()).i();
        }
        return i == 0;
    }

    public static boolean d(YourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo) {
        if (!c(yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo)) {
            h290<YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType> h290VarY = yourLibraryDecoratedEntityOuterClass$YourLibraryPlaylistExtraInfo.y();
            if (!h290VarY.isEmpty()) {
                for (YourLibraryDecoratedEntityOuterClass.NumberOfItemsForLinkType numberOfItemsForLinkType : h290VarY) {
                    if (!((numberOfItemsForLinkType.i() == 0) ^ (numberOfItemsForLinkType.h() == clc0.g))) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
