package p;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.io.OutputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cm5 extends ObjectInputStream implements InputStreamRetargetInterface {
    public cm5(BufferedInputStream bufferedInputStream) {
        super(bufferedInputStream);
    }

    @Override // java.io.ObjectInputStream
    public final ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
        ObjectStreamClass classDescriptor = super.readClassDescriptor();
        if (u890.j(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
            return ObjectStreamClass.lookup(yd.class);
        }
        return u890.j(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2") ? ObjectStreamClass.lookup(am5.class) : classDescriptor;
    }

    @Override // java.io.InputStream
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
