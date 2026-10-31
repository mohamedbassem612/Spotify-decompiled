package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryImage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.IconName;
import com.spotify.pendragon.v1.proto.AccessoryContent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class li implements iu30 {
    public final j141 a;

    public li(j141 j141Var) {
        this.a = j141Var;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        IconName iconName;
        AccessoryContent accessoryContent = (AccessoryContent) obj;
        int iO = accessoryContent.o();
        int i = iO == 0 ? -1 : ki.a[l1d.C(iO)];
        if (i != 1) {
            return i != 2 ? com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent.NotSet.INSTANCE : new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent.Image((AccessoryImage) this.a.invoke(accessoryContent.r()));
        }
        String strName = accessoryContent.q().q().name();
        IconName iconName2 = IconName.ICON_UNKNOWN;
        IconName[] iconNameArrValues = IconName.values();
        int length = iconNameArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                iconName = null;
                break;
            }
            iconName = iconNameArrValues[i2];
            if (u890.j(iconName.name(), strName)) {
                break;
            }
            i2++;
        }
        if (iconName != null) {
            iconName2 = iconName;
        }
        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent.Icon(new Icon(iconName2, ihc1.e1(accessoryContent.q().o()).toString()));
    }
}
