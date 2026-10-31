package androidx.media3.session.legacy;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p.bhn0;
import p.eg;
import p.hhg1;
import p.jv81;
import p.l1d;
import p.ncn0;
import p.nmr0;
import p.oon1;
import p.t36;
import p.t980;
import p.y36;
import p.zoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class MediaBrowserServiceCompat extends Service {
    private static final float EPSILON = 1.0E-5f;
    public static final String KEY_MEDIA_ITEM = "media_item";
    public static final String KEY_SEARCH_RESULTS = "search_results";
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    static final String TAG = "MBServiceCompat";
    ConnectionRecord curConnection;
    private MediaBrowserServiceImpl impl;
    MediaSessionCompat.Token session;
    private final ServiceBinderImpl serviceBinderImpl = new ServiceBinderImpl();
    final ConnectionRecord connectionFromFwk = new ConnectionRecord(MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER, -1, -1, null, null);
    final ArrayList<ConnectionRecord> pendingConnections = new ArrayList<>();
    final y36 connections = new y36(0);
    final ServiceHandler handler = new ServiceHandler(this);

    public static final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";

        @Deprecated
        public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final Bundle extras;
        private final String rootId;

        public BrowserRoot(String str, Bundle bundle) {
            if (str == null) {
                hhg1.n("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
                throw null;
            }
            this.rootId = str;
            this.extras = bundle;
        }

        public Bundle getExtras() {
            return this.extras;
        }

        public String getRootId() {
            return this.rootId;
        }
    }

    public class ConnectionRecord implements IBinder.DeathRecipient {
        public final MediaSessionManager.RemoteUserInfo browserInfo;
        public final ServiceCallbacks callbacks;
        public final int pid;
        public final String pkg;
        public final Bundle rootHints;
        public final HashMap<String, List<nmr0>> subscriptions = new HashMap<>();
        public final int uid;

        public ConnectionRecord(String str, int i, int i2, Bundle bundle, ServiceCallbacks serviceCallbacks) {
            this.pkg = str;
            this.pid = i;
            this.uid = i2;
            this.browserInfo = new MediaSessionManager.RemoteUserInfo(str, i, i2);
            this.rootHints = bundle;
            this.callbacks = serviceCallbacks;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            MediaBrowserServiceCompat.this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ConnectionRecord.1
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = ConnectionRecord.this;
                    y36 y36Var = MediaBrowserServiceCompat.this.connections;
                    ServiceCallbacks serviceCallbacks = connectionRecord.callbacks;
                    serviceCallbacks.getClass();
                    y36Var.remove(serviceCallbacks.asBinder());
                }
            });
        }
    }

    public interface MediaBrowserServiceImpl {
        Bundle getBrowserRootHints();

        MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle);

        void notifyChildrenChanged(String str, Bundle bundle);

        IBinder onBind(Intent intent);

        void onCreate();

        void setSessionToken(MediaSessionCompat.Token token);
    }

    public class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 {

        public class MediaBrowserServiceApi26 extends MediaBrowserServiceImplApi23.MediaBrowserServiceApi23 {
            public MediaBrowserServiceApi26(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                Bundle bundleP = zoi1.p(bundle);
                MediaBrowserServiceImplApi26 mediaBrowserServiceImplApi26 = MediaBrowserServiceImplApi26.this;
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.curConnection = mediaBrowserServiceCompat.connectionFromFwk;
                mediaBrowserServiceImplApi26.onLoadChildren(str, new ResultWrapper<>(result), bundleP);
                MediaBrowserServiceCompat.this.curConnection = null;
            }
        }

        public MediaBrowserServiceImplApi26() {
            super();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public Bundle getBrowserRootHints() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ConnectionRecord connectionRecord = mediaBrowserServiceCompat.curConnection;
            if (connectionRecord == null) {
                eg.m("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (connectionRecord == mediaBrowserServiceCompat.connectionFromFwk) {
                MediaBrowserService mediaBrowserService = this.serviceFwk;
                mediaBrowserService.getClass();
                return mediaBrowserService.getBrowserRootHints();
            }
            if (connectionRecord.rootHints == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.curConnection.rootHints);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23
        public void notifyChildrenChangedForFramework(String str, Bundle bundle) {
            if (bundle == null) {
                super.notifyChildrenChangedForFramework(str, bundle);
                return;
            }
            MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            mediaBrowserService.notifyChildrenChanged(str, bundle);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi26 mediaBrowserServiceApi26 = new MediaBrowserServiceApi26(MediaBrowserServiceCompat.this);
            this.serviceFwk = mediaBrowserServiceApi26;
            mediaBrowserServiceApi26.onCreate();
        }

        public void onLoadChildren(String str, final ResultWrapper<List<Parcel>> resultWrapper, final Bundle bundle) {
            Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi26.1
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                    if (list == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    if ((getFlags() & 1) != 0) {
                        list = MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                    }
                    ArrayList arrayList = new ArrayList(list == null ? 0 : list.size());
                    if (list != null) {
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel parcelObtain = Parcel.obtain();
                            mediaItem.writeToParcel(parcelObtain, 0);
                            arrayList.add(parcelObtain);
                        }
                    }
                    resultWrapper.sendResult(arrayList);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.curConnection = mediaBrowserServiceCompat.connectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, result, bundle);
            MediaBrowserServiceCompat.this.curConnection = null;
        }
    }

    public class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        public MediaBrowserServiceImplApi28() {
            super();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23, androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            ConnectionRecord connectionRecord = mediaBrowserServiceCompat.curConnection;
            if (connectionRecord == null) {
                eg.m("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (connectionRecord != mediaBrowserServiceCompat.connectionFromFwk) {
                return connectionRecord.browserInfo;
            }
            MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            return new MediaSessionManager.RemoteUserInfo(mediaBrowserService.getCurrentBrowserInfo());
        }
    }

    public static class Result<T> {
        private final Object debug;
        private boolean detachCalled;
        private int flags;
        private boolean sendErrorCalled;
        private boolean sendResultCalled;

        public Result(Object obj) {
            this.debug = obj;
        }

        private void checkExtraFields(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS)) {
                float f = bundle.getFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS);
                float fI = zoi1.i(f, -1.0E-5f, 1.00001f);
                if (f != fI) {
                    bundle.putFloat(MediaBrowserCompat.EXTRA_DOWNLOAD_PROGRESS, fI);
                    oon1.H("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0]. Actual value clamped to " + fI + " from " + f);
                }
            }
        }

        public void detach() {
            if (this.detachCalled) {
                bhn0.y(this.debug, "detach() called when detach() had already been called for: ");
                return;
            }
            if (this.sendResultCalled) {
                bhn0.y(this.debug, "detach() called when sendResult() had already been called for: ");
            } else if (this.sendErrorCalled) {
                bhn0.y(this.debug, "detach() called when sendError() had already been called for: ");
            } else {
                this.detachCalled = true;
            }
        }

        public int getFlags() {
            return this.flags;
        }

        public boolean isDone() {
            return this.detachCalled || this.sendResultCalled || this.sendErrorCalled;
        }

        public void onErrorSent(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.debug);
        }

        public void onProgressUpdateSent(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.debug);
        }

        public void onResultSent(T t) {
        }

        public void sendError(Bundle bundle) {
            if (this.sendResultCalled || this.sendErrorCalled) {
                bhn0.y(this.debug, "sendError() called when either sendResult() or sendError() had already been called for: ");
            } else {
                this.sendErrorCalled = true;
                onErrorSent(bundle);
            }
        }

        public void sendProgressUpdate(Bundle bundle) {
            if (this.sendResultCalled || this.sendErrorCalled) {
                bhn0.y(this.debug, "sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
            } else {
                checkExtraFields(bundle);
                onProgressUpdateSent(bundle);
            }
        }

        public void sendResult(T t) {
            if (this.sendResultCalled || this.sendErrorCalled) {
                bhn0.y(this.debug, "sendResult() called when either sendResult() or sendError() had already been called for: ");
            } else {
                this.sendResultCalled = true;
                onResultSent(t);
            }
        }

        public void setFlags(int i) {
            this.flags = i;
        }
    }

    public static class ResultWrapper<T> {
        MediaBrowserService.Result resultFwk;

        public ResultWrapper(MediaBrowserService.Result result) {
            this.resultFwk = result;
        }

        public void detach() {
            this.resultFwk.detach();
        }

        public List<MediaBrowser.MediaItem> parcelListToItemList(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void sendResult(T t) {
            if (t instanceof List) {
                this.resultFwk.sendResult(parcelListToItemList((List) t));
                return;
            }
            if (!(t instanceof Parcel)) {
                this.resultFwk.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t;
            parcel.setDataPosition(0);
            this.resultFwk.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    public class ServiceBinderImpl {
        public ServiceBinderImpl() {
        }

        public void addSubscription(final String str, final IBinder iBinder, final Bundle bundle, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.handler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.addSubscription(str, connectionRecord, iBinder, bundle);
                        return;
                    }
                    oon1.H("addSubscription for callback that isn't registered id=" + str);
                }
            });
        }

        public void getMediaItem(final String str, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.handler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.performLoadItem(str, connectionRecord, resultReceiver);
                        return;
                    }
                    oon1.H("getMediaItem for callback that isn't registered id=" + str);
                }
            });
        }

        public void registerCallbacks(final ServiceCallbacks serviceCallbacks, final String str, final int i, final int i2, final Bundle bundle) {
            MediaBrowserServiceCompat.this.handler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord;
                    IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    MediaBrowserServiceCompat.this.connections.remove(iBinderAsBinder);
                    Iterator<ConnectionRecord> it = MediaBrowserServiceCompat.this.pendingConnections.iterator();
                    while (true) {
                        connectionRecord = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        ConnectionRecord next = it.next();
                        if (next.uid == i2) {
                            connectionRecord = (TextUtils.isEmpty(str) || i <= 0) ? MediaBrowserServiceCompat.this.new ConnectionRecord(next.pkg, next.pid, next.uid, bundle, serviceCallbacks) : null;
                            it.remove();
                            break;
                        }
                    }
                    if (connectionRecord == null) {
                        connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(str, i, i2, bundle, serviceCallbacks);
                    }
                    MediaBrowserServiceCompat.this.connections.put(iBinderAsBinder, connectionRecord);
                    try {
                        iBinderAsBinder.linkToDeath(connectionRecord, 0);
                    } catch (RemoteException unused) {
                        oon1.H("IBinder is already dead.");
                    }
                }
            });
        }

        public void removeSubscription(final String str, final IBinder iBinder, final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.handler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord == null) {
                        oon1.H("removeSubscription for callback that isn't registered id=" + str);
                    } else {
                        if (MediaBrowserServiceCompat.this.removeSubscription(str, connectionRecord, iBinder)) {
                            return;
                        }
                        oon1.H("removeSubscription called for " + str + " which is not subscribed");
                    }
                }
            });
        }

        public void search(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.handler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.performSearch(str, bundle, connectionRecord, resultReceiver);
                        return;
                    }
                    oon1.H("search for callback that isn't registered query=" + str);
                }
            });
        }

        public void sendCustomAction(final String str, final Bundle bundle, final ResultReceiver resultReceiver, final ServiceCallbacks serviceCallbacks) {
            if (TextUtils.isEmpty(str) || resultReceiver == null) {
                return;
            }
            MediaBrowserServiceCompat.this.handler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.7
                @Override // java.lang.Runnable
                public void run() {
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.connections.get(serviceCallbacks.asBinder());
                    if (connectionRecord != null) {
                        MediaBrowserServiceCompat.this.performCustomAction(str, bundle, connectionRecord, resultReceiver);
                        return;
                    }
                    oon1.H("sendCustomAction for callback that isn't registered action=" + str + ", extras=" + bundle);
                }
            });
        }

        public void unregisterCallbacks(final ServiceCallbacks serviceCallbacks) {
            MediaBrowserServiceCompat.this.handler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceBinderImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    IBinder iBinderAsBinder = serviceCallbacks.asBinder();
                    ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.connections.remove(iBinderAsBinder);
                    if (connectionRecord != null) {
                        iBinderAsBinder.unlinkToDeath(connectionRecord, 0);
                    }
                }
            });
        }
    }

    public interface ServiceCallbacks {
        IBinder asBinder();

        void onLoadChildren(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2);
    }

    public static class ServiceCallbacksCompat implements ServiceCallbacks {
        final Messenger callbacks;

        public ServiceCallbacksCompat(Messenger messenger) {
            this.callbacks = messenger;
        }

        private void sendRequest(int i, Bundle bundle) throws RemoteException {
            Message messageObtain = Message.obtain();
            messageObtain.what = i;
            messageObtain.arg1 = 2;
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            this.callbacks.send(messageObtain);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks
        public IBinder asBinder() {
            return this.callbacks.getBinder();
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.ServiceCallbacks
        public void onLoadChildren(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
            bundle3.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
            bundle3.putBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST, LegacyParcelableUtil.convertList(list, android.support.v4.media.MediaBrowserCompat$MediaItem.CREATOR));
            }
            sendRequest(3, bundle3);
        }
    }

    public static final class ServiceHandler extends Handler {
        private MediaBrowserServiceCompat service;

        /* JADX WARN: Illegal instructions before constructor call */
        public ServiceHandler(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            super(looperMyLooper);
            this.service = mediaBrowserServiceCompat;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = this.service;
            if (mediaBrowserServiceCompat != null) {
                mediaBrowserServiceCompat.handleMessageInternal(message);
            } else {
                removeCallbacksAndMessages(null);
            }
        }

        public void postOrRun(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void release() {
            this.service = null;
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            ClassLoader classLoader = MediaBrowserCompat.class.getClassLoader();
            classLoader.getClass();
            data.setClassLoader(classLoader);
            data.putInt(MediaBrowserProtocol.DATA_CALLING_UID, Binder.getCallingUid());
            data.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    public void addSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder, Bundle bundle) {
        List<nmr0> arrayList = connectionRecord.subscriptions.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (nmr0 nmr0Var : arrayList) {
            if (iBinder == nmr0Var.a && MediaBrowserCompatUtils.areSameOptions(bundle, (Bundle) nmr0Var.b)) {
                return;
            }
        }
        arrayList.add(new nmr0(iBinder, bundle));
        connectionRecord.subscriptions.put(str, arrayList);
        performLoadChildren(str, connectionRecord, bundle, null);
        this.curConnection = connectionRecord;
        onSubscribe(str, bundle);
        this.curConnection = null;
    }

    public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        if (bundle != null) {
            int i = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
            int i2 = bundle.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
            if (i != -1 || i2 != -1) {
                int i3 = i2 * i;
                int size = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (size > list.size()) {
                    size = list.size();
                }
                return list.subList(i3, size);
            }
        }
        return list;
    }

    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final Bundle getBrowserRootHints() {
        MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        return mediaBrowserServiceImpl.getBrowserRootHints();
    }

    public final MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
        MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        return mediaBrowserServiceImpl.getCurrentBrowserInfo();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.session;
    }

    public void handleMessageInternal(Message message) {
        Bundle data = message.getData();
        try {
            switch (message.what) {
                case 3:
                    this.serviceBinderImpl.addSubscription(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN), zoi1.p(data.getBundle(MediaBrowserProtocol.DATA_OPTIONS)), new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 4:
                    this.serviceBinderImpl.removeSubscription(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), data.getBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN), new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 5:
                    this.serviceBinderImpl.getMediaItem(data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 6:
                    this.serviceBinderImpl.registerCallbacks(new ServiceCallbacksCompat(message.replyTo), data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), data.getInt(MediaBrowserProtocol.DATA_CALLING_PID), data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), zoi1.p(data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS)));
                    break;
                case 7:
                    this.serviceBinderImpl.unregisterCallbacks(new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 8:
                    this.serviceBinderImpl.search(data.getString(MediaBrowserProtocol.DATA_SEARCH_QUERY), zoi1.p(data.getBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS)), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new ServiceCallbacksCompat(message.replyTo));
                    break;
                case 9:
                    this.serviceBinderImpl.sendCustomAction(data.getString(MediaBrowserProtocol.DATA_CUSTOM_ACTION), zoi1.p(data.getBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS)), (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER), new ServiceCallbacksCompat(message.replyTo));
                    break;
                default:
                    oon1.H("Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    break;
            }
        } catch (RuntimeException e) {
            oon1.I("Failed to handle message due to malformed Bundle", e);
        }
    }

    public void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
        if (remoteUserInfo == null) {
            hhg1.n("remoteUserInfo cannot be null in notifyChildrenChanged");
            return;
        }
        if (str == null) {
            hhg1.n("parentId cannot be null in notifyChildrenChanged");
        } else {
            if (bundle == null) {
                hhg1.n("options cannot be null in notifyChildrenChanged");
                return;
            }
            MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
            mediaBrowserServiceImpl.getClass();
            mediaBrowserServiceImpl.notifyChildrenChanged(remoteUserInfo, str, bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        return mediaBrowserServiceImpl.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        MediaBrowserServiceImpl mediaBrowserServiceImplApi23;
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            mediaBrowserServiceImplApi23 = new MediaBrowserServiceImplApi28();
            this.impl = mediaBrowserServiceImplApi23;
        } else if (i >= 26) {
            mediaBrowserServiceImplApi23 = new MediaBrowserServiceImplApi26();
            this.impl = mediaBrowserServiceImplApi23;
        } else {
            mediaBrowserServiceImplApi23 = new MediaBrowserServiceImplApi23();
            this.impl = mediaBrowserServiceImplApi23;
        }
        mediaBrowserServiceImplApi23.onCreate();
    }

    public void onCustomAction(String str, Bundle bundle, Result<Bundle> result) {
        result.sendError(null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.handler.release();
    }

    public abstract BrowserRoot onGetRoot(String str, int i, Bundle bundle);

    public abstract void onLoadChildren(String str, Result<List<MediaBrowserCompat.MediaItem>> result);

    public void onLoadChildren(String str, Result<List<MediaBrowserCompat.MediaItem>> result, Bundle bundle) {
        result.setFlags(1);
        onLoadChildren(str, result);
    }

    public void onLoadItem(String str, Result<MediaBrowserCompat.MediaItem> result) {
        result.setFlags(2);
        result.sendResult(null);
    }

    public void onSearch(String str, Bundle bundle, Result<List<MediaBrowserCompat.MediaItem>> result) {
        result.setFlags(4);
        result.sendResult(null);
    }

    public void onSubscribe(String str, Bundle bundle) {
    }

    public void onUnsubscribe(String str) {
    }

    public void performCustomAction(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<Bundle> result = new Result<Bundle>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.4
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onErrorSent(Bundle bundle2) {
                resultReceiver.send(-1, bundle2);
            }

            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onProgressUpdateSent(Bundle bundle2) {
                resultReceiver.send(1, bundle2);
            }

            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(Bundle bundle2) {
                resultReceiver.send(0, bundle2);
            }
        };
        this.curConnection = connectionRecord;
        onCustomAction(str, bundle == null ? Bundle.EMPTY : bundle, result);
        this.curConnection = null;
        if (result.isDone()) {
            return;
        }
        ncn0.f("onCustomAction must call detach() or sendResult() or sendError() before returning for action=", str, " extras=", bundle);
    }

    public void performLoadChildren(final String str, final ConnectionRecord connectionRecord, final Bundle bundle, final Bundle bundle2) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.1
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                y36 y36Var = MediaBrowserServiceCompat.this.connections;
                ServiceCallbacks serviceCallbacks = connectionRecord.callbacks;
                serviceCallbacks.getClass();
                if (y36Var.get(serviceCallbacks.asBinder()) != connectionRecord) {
                    oon1.s("Not sending onLoadChildren result for connection that has been disconnected. pkg=" + connectionRecord.pkg + " id=" + str);
                    return;
                }
                if ((getFlags() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions(list, bundle);
                }
                try {
                    connectionRecord.callbacks.onLoadChildren(str, list, bundle, bundle2);
                } catch (RemoteException unused) {
                    oon1.H("Calling onLoadChildren() failed for id=" + str + " package=" + connectionRecord.pkg);
                }
            }
        };
        this.curConnection = connectionRecord;
        if (bundle == null) {
            onLoadChildren(str, result);
        } else {
            onLoadChildren(str, result, bundle);
        }
        this.curConnection = null;
        if (result.isDone()) {
            return;
        }
        eg.m(l1d.q(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), connectionRecord.pkg, " id=", str));
    }

    public void performLoadItem(String str, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.2
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(MediaBrowserCompat.MediaItem mediaItem) {
                if ((getFlags() & 2) != 0) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, LegacyParcelableUtil.convert(mediaItem, android.support.v4.media.MediaBrowserCompat$MediaItem.CREATOR));
                resultReceiver.send(0, bundle);
            }
        };
        this.curConnection = connectionRecord;
        onLoadItem(str, result);
        this.curConnection = null;
        if (result.isDone()) {
            return;
        }
        eg.m(l1d.m("onLoadItem must call detach() or sendResult() before returning for id=", str));
    }

    public void performSearch(String str, Bundle bundle, ConnectionRecord connectionRecord, final ResultReceiver resultReceiver) {
        Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.3
            @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
            public void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                if ((getFlags() & 4) != 0 || list == null) {
                    resultReceiver.send(-1, null);
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) LegacyParcelableUtil.convertList(list, android.support.v4.media.MediaBrowserCompat$MediaItem.CREATOR).toArray(new android.support.v4.media.MediaBrowserCompat$MediaItem[0]));
                resultReceiver.send(0, bundle2);
            }
        };
        this.curConnection = connectionRecord;
        onSearch(str, bundle, result);
        this.curConnection = null;
        if (result.isDone()) {
            return;
        }
        eg.m(l1d.m("onSearch must call detach() or sendResult() before returning for query=", str));
    }

    public boolean removeSubscription(String str, ConnectionRecord connectionRecord, IBinder iBinder) {
        boolean z = false;
        try {
            if (iBinder != null) {
                List<nmr0> list = connectionRecord.subscriptions.get(str);
                if (list != null) {
                    Iterator<nmr0> it = list.iterator();
                    while (it.hasNext()) {
                        if (iBinder == it.next().a) {
                            it.remove();
                            z = true;
                        }
                    }
                    if (list.isEmpty()) {
                        connectionRecord.subscriptions.remove(str);
                    }
                }
            } else if (connectionRecord.subscriptions.remove(str) != null) {
                z = true;
            }
            this.curConnection = connectionRecord;
            onUnsubscribe(str);
            this.curConnection = null;
            return z;
        } catch (Throwable th) {
            this.curConnection = connectionRecord;
            onUnsubscribe(str);
            this.curConnection = null;
            throw th;
        }
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token == null) {
            hhg1.n("Session token may not be null");
            return;
        }
        if (this.session != null) {
            eg.m("The session token has already been set");
            return;
        }
        this.session = token;
        MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
        mediaBrowserServiceImpl.getClass();
        mediaBrowserServiceImpl.setSessionToken(token);
    }

    public class MediaBrowserServiceImplApi23 implements MediaBrowserServiceImpl {
        Messenger messenger;
        final List<Bundle> rootExtrasList = new ArrayList();
        MediaBrowserService serviceFwk;

        public class MediaBrowserServiceApi23 extends MediaBrowserService {
            public MediaBrowserServiceApi23(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
                Bundle bundleP = zoi1.p(bundle);
                BrowserRoot browserRootOnGetRoot = MediaBrowserServiceImplApi23.this.onGetRoot(str, i, bundleP == null ? null : new Bundle(bundleP));
                if (browserRootOnGetRoot == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(browserRootOnGetRoot.rootId, browserRootOnGetRoot.extras);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                MediaBrowserServiceImplApi23.this.onLoadChildren(str, new ResultWrapper<>(result));
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                MediaBrowserServiceImplApi23.this.onLoadItem(str, new ResultWrapper<>(result));
            }
        }

        public MediaBrowserServiceImplApi23() {
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public Bundle getBrowserRootHints() {
            if (this.messenger == null) {
                return null;
            }
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.curConnection;
            if (connectionRecord == null) {
                eg.m("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
                return null;
            }
            if (connectionRecord.rootHints == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.curConnection.rootHints);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public MediaSessionManager.RemoteUserInfo getCurrentBrowserInfo() {
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.curConnection;
            if (connectionRecord != null) {
                return connectionRecord.browserInfo;
            }
            eg.m("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            return null;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(String str, Bundle bundle) {
            notifyChildrenChangedForFramework(str, bundle);
            notifyChildrenChangedForCompat(str, bundle);
        }

        public void notifyChildrenChangedForCompat(final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.3
                @Override // java.lang.Runnable
                public void run() {
                    Iterator it = ((t36) MediaBrowserServiceCompat.this.connections.keySet()).iterator();
                    while (true) {
                        t980 t980Var = (t980) it;
                        if (!t980Var.hasNext()) {
                            return;
                        }
                        ConnectionRecord connectionRecord = (ConnectionRecord) MediaBrowserServiceCompat.this.connections.get((IBinder) t980Var.next());
                        connectionRecord.getClass();
                        MediaBrowserServiceImplApi23.this.notifyChildrenChangedForCompatOnHandler(connectionRecord, str, bundle);
                    }
                }
            });
        }

        public void notifyChildrenChangedForCompatOnHandler(ConnectionRecord connectionRecord, String str, Bundle bundle) {
            List<nmr0> list = connectionRecord.subscriptions.get(str);
            if (list != null) {
                for (nmr0 nmr0Var : list) {
                    if (MediaBrowserCompatUtils.hasDuplicatedItems(bundle, (Bundle) nmr0Var.b)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, connectionRecord, (Bundle) nmr0Var.b, bundle);
                    }
                }
            }
        }

        public void notifyChildrenChangedForFramework(String str, Bundle bundle) {
            MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            mediaBrowserService.notifyChildrenChanged(str);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public IBinder onBind(Intent intent) {
            MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            return mediaBrowserService.onBind(intent);
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void onCreate() {
            MediaBrowserServiceApi23 mediaBrowserServiceApi23 = new MediaBrowserServiceApi23(MediaBrowserServiceCompat.this);
            this.serviceFwk = mediaBrowserServiceApi23;
            mediaBrowserServiceApi23.onCreate();
        }

        public BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            int pid;
            Bundle bundle2;
            if (Build.VERSION.SDK_INT >= 28) {
                MediaBrowserService mediaBrowserService = this.serviceFwk;
                mediaBrowserService.getClass();
                pid = mediaBrowserService.getCurrentBrowserInfo().getPid();
            } else {
                pid = -1;
            }
            int i2 = pid;
            if (bundle == null || bundle.getInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(MediaBrowserProtocol.EXTRA_CLIENT_VERSION);
                this.messenger = new Messenger(MediaBrowserServiceCompat.this.handler);
                Bundle bundle3 = new Bundle();
                bundle3.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
                bundle3.putBinder(MediaBrowserProtocol.EXTRA_MESSENGER_BINDER, this.messenger.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.session;
                if (token != null) {
                    IMediaSession extraBinder = token.getExtraBinder();
                    bundle3.putBinder(MediaBrowserProtocol.EXTRA_SESSION_BINDER, extraBinder == null ? null : extraBinder.asBinder());
                } else {
                    this.rootExtrasList.add(bundle3);
                }
                bundle.remove(MediaBrowserProtocol.EXTRA_CALLING_PID);
                bundle2 = bundle3;
            }
            ConnectionRecord connectionRecord = MediaBrowserServiceCompat.this.new ConnectionRecord(str, i2, i, bundle, null);
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.curConnection = connectionRecord;
            BrowserRoot browserRootOnGetRoot = mediaBrowserServiceCompat.onGetRoot(str, i, bundle);
            MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat2.curConnection = null;
            if (browserRootOnGetRoot == null) {
                return null;
            }
            if (this.messenger != null) {
                mediaBrowserServiceCompat2.pendingConnections.add(connectionRecord);
            }
            Bundle extras = browserRootOnGetRoot.getExtras();
            if (bundle2 == null) {
                bundle2 = extras;
            } else if (extras != null) {
                bundle2.putAll(extras);
            }
            return new BrowserRoot(browserRootOnGetRoot.getRootId(), bundle2);
        }

        public void onLoadChildren(String str, final ResultWrapper<List<Parcel>> resultWrapper) {
            Result<List<MediaBrowserCompat.MediaItem>> result = new Result<List<MediaBrowserCompat.MediaItem>>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.2
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(List<MediaBrowserCompat.MediaItem> list) {
                    ArrayList arrayList;
                    if (list == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        for (MediaBrowserCompat.MediaItem mediaItem : list) {
                            Parcel parcelObtain = Parcel.obtain();
                            mediaItem.writeToParcel(parcelObtain, 0);
                            arrayList2.add(parcelObtain);
                        }
                        arrayList = arrayList2;
                    }
                    resultWrapper.sendResult(arrayList);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.curConnection = mediaBrowserServiceCompat.connectionFromFwk;
            mediaBrowserServiceCompat.onLoadChildren(str, result);
            MediaBrowserServiceCompat.this.curConnection = null;
        }

        public void onLoadItem(String str, final ResultWrapper<Parcel> resultWrapper) {
            Result<MediaBrowserCompat.MediaItem> result = new Result<MediaBrowserCompat.MediaItem>(str) { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.5
                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void detach() {
                    resultWrapper.detach();
                }

                @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.Result
                public void onResultSent(MediaBrowserCompat.MediaItem mediaItem) {
                    if (mediaItem == null) {
                        resultWrapper.sendResult(null);
                        return;
                    }
                    Parcel parcelObtain = Parcel.obtain();
                    mediaItem.writeToParcel(parcelObtain, 0);
                    resultWrapper.sendResult(parcelObtain);
                }
            };
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.curConnection = mediaBrowserServiceCompat.connectionFromFwk;
            mediaBrowserServiceCompat.onLoadItem(str, result);
            MediaBrowserServiceCompat.this.curConnection = null;
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void setSessionToken(final MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.handler.postOrRun(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.1
                @Override // java.lang.Runnable
                public void run() {
                    MediaBrowserServiceImplApi23.this.setSessionTokenOnHandler(token);
                }
            });
        }

        public void setSessionTokenOnHandler(MediaSessionCompat.Token token) {
            if (!this.rootExtrasList.isEmpty()) {
                IMediaSession extraBinder = token.getExtraBinder();
                if (extraBinder != null) {
                    Iterator<Bundle> it = this.rootExtrasList.iterator();
                    while (it.hasNext()) {
                        it.next().putBinder(MediaBrowserProtocol.EXTRA_SESSION_BINDER, extraBinder.asBinder());
                    }
                }
                this.rootExtrasList.clear();
            }
            MediaBrowserService mediaBrowserService = this.serviceFwk;
            mediaBrowserService.getClass();
            mediaBrowserService.setSessionToken(token.getToken());
        }

        @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImpl
        public void notifyChildrenChanged(MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle) {
            notifyChildrenChangedForCompat(remoteUserInfo, str, bundle);
        }

        public void notifyChildrenChangedForCompat(final MediaSessionManager.RemoteUserInfo remoteUserInfo, final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.handler.post(new Runnable() { // from class: androidx.media3.session.legacy.MediaBrowserServiceCompat.MediaBrowserServiceImplApi23.4
                @Override // java.lang.Runnable
                public void run() {
                    int i = 0;
                    while (true) {
                        y36 y36Var = MediaBrowserServiceCompat.this.connections;
                        if (i >= ((jv81) y36Var).c) {
                            return;
                        }
                        ConnectionRecord connectionRecord = (ConnectionRecord) y36Var.i(i);
                        if (connectionRecord.browserInfo.equals(remoteUserInfo)) {
                            MediaBrowserServiceImplApi23.this.notifyChildrenChangedForCompatOnHandler(connectionRecord, str, bundle);
                        }
                        i++;
                    }
                }
            });
        }
    }

    public void notifyChildrenChanged(String str, Bundle bundle) {
        if (str == null) {
            hhg1.n("parentId cannot be null in notifyChildrenChanged");
        } else {
            if (bundle != null) {
                MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
                mediaBrowserServiceImpl.getClass();
                mediaBrowserServiceImpl.notifyChildrenChanged(str, bundle);
                return;
            }
            hhg1.n("options cannot be null in notifyChildrenChanged");
        }
    }

    public void notifyChildrenChanged(String str) {
        if (str != null) {
            MediaBrowserServiceImpl mediaBrowserServiceImpl = this.impl;
            mediaBrowserServiceImpl.getClass();
            mediaBrowserServiceImpl.notifyChildrenChanged(str, null);
            return;
        }
        hhg1.n("parentId cannot be null in notifyChildrenChanged");
    }
}
