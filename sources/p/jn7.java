package p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.PreviewRequest;
import com.spotify.ads.esperanto.proto.PreviewResponse;
import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass;
import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass$AtvPairingResponse;
import com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass$AtvStartPairingRequest;
import com.spotify.authenticated_sessions.session_termination.proto.EsSessionTermination$TerminateSessionRequest;
import com.spotify.authenticated_sessions.session_termination.proto.EsSessionTermination$TerminateSessionResult;
import com.spotify.automix.esperanto.proto.EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetBeatmatchOptOutTransitionDurationResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetComputedTransitionsRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$GetComputedTransitionsResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetEqStylesForEqStyleIdRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$GetEqStylesForEqStyleIdResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetFilterFxStylesForFilterFxStyleIdRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetFxStylesForFxStyleIdRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$GetFxStylesForFxStyleIdResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetJogwheelBlocksRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$GetJogwheelBlocksResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetLoopingBlocksRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$GetLoopingBlocksResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetMaxTransitionLengthResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetStylesForPresetIdRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$GetStylesForPresetIdResponse;
import com.spotify.automix.esperanto.proto.EsAutomix$GetVolumeStylesForVolumeStyleIdRequest;
import com.spotify.automix.esperanto.proto.EsAutomix$GetVolumeStylesForVolumeStyleIdResponse;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass;
import com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass$IsCappedResponse;
import com.spotify.connect.esperanto.proto.CommonMessages;
import com.spotify.connect.esperanto.proto.ConnectMessages;
import com.spotify.decipher.agent.v1.ActionRequest;
import com.spotify.decipher.agent.v1.ClientSideEventRequest;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import com.spotify.player.esperanto.proto.EsGetStateRequest;
import com.spotify.player.esperanto.proto.EsPause;
import com.spotify.player.esperanto.proto.EsPlay;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.esperanto.proto.EsResume;
import com.spotify.player.esperanto.proto.EsSeekTo;
import com.spotify.player.esperanto.proto.EsSignalRequest;
import com.spotify.player.esperanto.proto.EsSkipNext;
import com.spotify.player.esperanto.proto.EsStop;
import com.spotify.playlist.proto.PlaylistMembersRequest;
import com.spotify.playlist.proto.SetMemberPermissionRequest;
import com.spotify.playlist.proto.SyncRequest;
import com.spotify.read_reporting_esperanto.proto.ReadEndRequest;
import com.spotify.read_reporting_esperanto.proto.ReadStartRequest;
import com.spotify.read_reporting_esperanto.proto.ReadStartResponse;
import com.spotify.read_reporting_esperanto.proto.ReadUpdateRequest;
import com.spotify.read_reporting_esperanto.proto.StatusResponse;
import com.spotify.runtime_consumption.esperanto.proto.GetConsumptionRecordsRequest;
import com.spotify.runtime_consumption.esperanto.proto.GetConsumptionRecordsResponse;
import com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionRequest;
import com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionResponse;
import com.spotify.storage.esperanto.proto.EsStorage;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass;
import com.spotify.stream_reporting_esperanto.proto.StreamEndRequestOuterClass;
import com.spotify.stream_reporting_esperanto.proto.StreamProgressRequestOuterClass;
import com.spotify.stream_reporting_esperanto.proto.StreamSeekRequestOuterClass;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass;
import com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass;
import j$.util.Base64;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse;
import spotify.collection.esperanto.proto.CollectionContainsRequest;
import spotify.collection.esperanto.proto.CollectionContainsResponse;
import spotify.collection.esperanto.proto.CollectionDecorateRequest;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;
import spotify.playlist.esperanto.proto.CopyRequest;
import spotify.playlist.esperanto.proto.CopyResponse;
import spotify.playlist.esperanto.proto.PlaylistClearTokenRequest;
import spotify.playlist.esperanto.proto.PlaylistClearTokenResponse;
import spotify.playlist.esperanto.proto.PlaylistContainsRequest;
import spotify.playlist.esperanto.proto.PlaylistContainsResponse;
import spotify.playlist.esperanto.proto.PlaylistFindRequest;
import spotify.playlist.esperanto.proto.PlaylistFindResponse;
import spotify.playlist.esperanto.proto.PlaylistGetRequest;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.playlist.esperanto.proto.PlaylistInvalidateRevisionsResponse;
import spotify.playlist.esperanto.proto.PlaylistItemSignalResponse;
import spotify.playlist.esperanto.proto.PlaylistLensRequest;
import spotify.playlist.esperanto.proto.PlaylistLensResponse;
import spotify.playlist.esperanto.proto.PlaylistMembersResponse;
import spotify.playlist.esperanto.proto.PlaylistModificationRequest;
import spotify.playlist.esperanto.proto.PlaylistModificationResponse;
import spotify.playlist.esperanto.proto.PlaylistMultiGetRequest;
import spotify.playlist.esperanto.proto.PlaylistMultiGetResponse;
import spotify.playlist.esperanto.proto.PlaylistMultiItemSignalRequest;
import spotify.playlist.esperanto.proto.PlaylistMultiSignalRequest;
import spotify.playlist.esperanto.proto.PlaylistOfflineRequest;
import spotify.playlist.esperanto.proto.PlaylistOfflineResponse;
import spotify.playlist.esperanto.proto.PlaylistPlayRequest;
import spotify.playlist.esperanto.proto.PlaylistPlayResponse;
import spotify.playlist.esperanto.proto.PlaylistResyncResponse;
import spotify.playlist.esperanto.proto.PlaylistSetBasePermissionRequest;
import spotify.playlist.esperanto.proto.PlaylistSetBasePermissionResponse;
import spotify.playlist.esperanto.proto.PlaylistSetMemberPermissionResponse;
import spotify.playlist.esperanto.proto.PlaylistSetTokenRequest;
import spotify.playlist.esperanto.proto.PlaylistSetTokenResponse;
import spotify.playlist.esperanto.proto.PlaylistSignalResponse;
import spotify.playlist.esperanto.proto.RootlistModificationRequest;
import spotify.playlist.esperanto.proto.RootlistModificationResponse;
import spotify.playlist.local_list_config_esperanto.proto.LocalListConfigSaveRequest;
import spotify.playlist.local_list_config_esperanto.proto.LocalListConfigSaveResponse;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jn7 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(Empty empty, onm onmVar) {
        v79 v79Var;
        if (onmVar instanceof v79) {
            v79Var = (v79) onmVar;
            int i = v79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v79Var.c = i - Integer.MIN_VALUE;
            } else {
                v79Var = new v79(this, onmVar);
            }
        } else {
            v79Var = new v79(this, onmVar);
        }
        Object objCallSingle = v79Var.a;
        int i2 = v79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            v79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetMaxTransitionLength", empty, v79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetMaxTransitionLengthResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetMaxTransitionLengthResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A0(StreamProgressRequestOuterClass.StreamProgressRequest streamProgressRequest, onm onmVar) {
        jec1 jec1Var;
        if (onmVar instanceof jec1) {
            jec1Var = (jec1) onmVar;
            int i = jec1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jec1Var.c = i - Integer.MIN_VALUE;
            } else {
                jec1Var = new jec1(this, onmVar);
            }
        } else {
            jec1Var = new jec1(this, onmVar);
        }
        Object objCallSingle = jec1Var.a;
        int i2 = jec1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            jec1Var.c = 1;
            objCallSingle = callSingle("spotify.stream_reporting_esperanto.proto.StreamReportingService", "StreamProgress", streamProgressRequest, jec1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return StatusResponseOuterClass.StatusResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(PlaylistMembersRequest playlistMembersRequest, onm onmVar) {
        itu0 itu0Var;
        if (onmVar instanceof itu0) {
            itu0Var = (itu0) onmVar;
            int i = itu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                itu0Var.c = i - Integer.MIN_VALUE;
            } else {
                itu0Var = new itu0(this, onmVar);
            }
        } else {
            itu0Var = new itu0(this, onmVar);
        }
        Object objCallSingle = itu0Var.a;
        int i2 = itu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            itu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "GetMembers", playlistMembersRequest, itu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistMembersResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistMembersResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B0(StreamSeekRequestOuterClass.StreamSeekRequest streamSeekRequest, onm onmVar) {
        kec1 kec1Var;
        if (onmVar instanceof kec1) {
            kec1Var = (kec1) onmVar;
            int i = kec1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kec1Var.c = i - Integer.MIN_VALUE;
            } else {
                kec1Var = new kec1(this, onmVar);
            }
        } else {
            kec1Var = new kec1(this, onmVar);
        }
        Object objCallSingle = kec1Var.a;
        int i2 = kec1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            kec1Var.c = 1;
            objCallSingle = callSingle("spotify.stream_reporting_esperanto.proto.StreamReportingService", "StreamSeek", streamSeekRequest, kec1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return StatusResponseOuterClass.StatusResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C(CommonCappingOuterClass.GetQuotaStateAtRequest getQuotaStateAtRequest, onm onmVar) {
        brh brhVar;
        if (onmVar instanceof brh) {
            brhVar = (brh) onmVar;
            int i = brhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                brhVar.c = i - Integer.MIN_VALUE;
            } else {
                brhVar = new brh(this, onmVar);
            }
        } else {
            brhVar = new brh(this, onmVar);
        }
        Object objCallSingle = brhVar.a;
        int i2 = brhVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            brhVar.c = 1;
            objCallSingle = callSingle("spotify.common_capping.impl.common_capping_proto.CommonCapping", "GetQuotaStateAt", getQuotaStateAtRequest, brhVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CommonCappingOuterClass.GetQuotaStateAtResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass.GetQuotaStateAtResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object C0(StreamStartRequestOuterClass.StreamStartRequest streamStartRequest, onm onmVar) {
        lec1 lec1Var;
        if (onmVar instanceof lec1) {
            lec1Var = (lec1) onmVar;
            int i = lec1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lec1Var.c = i - Integer.MIN_VALUE;
            } else {
                lec1Var = new lec1(this, onmVar);
            }
        } else {
            lec1Var = new lec1(this, onmVar);
        }
        Object objCallSingle = lec1Var.a;
        int i2 = lec1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            lec1Var.c = 1;
            objCallSingle = callSingle("spotify.stream_reporting_esperanto.proto.StreamReportingService", "StreamStart", streamStartRequest, lec1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return StreamStartResponseOuterClass.StreamStartResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass.StreamStartResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(ResumptionProgressEsperanto.GetResumePointRequest getResumePointRequest, onm onmVar) {
        g831 g831Var;
        if (onmVar instanceof g831) {
            g831Var = (g831) onmVar;
            int i = g831Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g831Var.c = i - Integer.MIN_VALUE;
            } else {
                g831Var = new g831(this, onmVar);
            }
        } else {
            g831Var = new g831(this, onmVar);
        }
        Object objCallSingle = g831Var.a;
        int i2 = g831Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            g831Var.c = 1;
            objCallSingle = callSingle("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "GetResumePoint", getResumePointRequest, g831Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ResumptionProgressEsperanto.GetResumePointResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.GetResumePointResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D0(AtvRemoteServiceOuterClass.AtvSubmitPinRequest atvSubmitPinRequest, onm onmVar) {
        in7 in7Var;
        if (onmVar instanceof in7) {
            in7Var = (in7) onmVar;
            int i = in7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                in7Var.c = i - Integer.MIN_VALUE;
            } else {
                in7Var = new in7(this, onmVar);
            }
        } else {
            in7Var = new in7(this, onmVar);
        }
        Object objCallSingle = in7Var.a;
        int i2 = in7Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            in7Var.c = 1;
            objCallSingle = callSingle("spotify.atv_remote.esperanto.proto.AtvRemoteService", "SubmitPin", atvSubmitPinRequest, in7Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return AtvRemoteServiceOuterClass$AtvPairingResponse.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass.AtvPairingResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    public dkm E(EsGetStateRequest.GetStateRequest getStateRequest) {
        return new dkm(callStream("spotify.player.esperanto.proto.ContextPlayer", "GetState", getStateRequest), (byte) 0);
    }

    public lt0 E0(PlaylistGetRequest playlistGetRequest) {
        return new lt0(callStream("spotify.playlist_esperanto.proto.PlaylistDataService", "Subscribe", playlistGetRequest), (byte) 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object F(EsStorage.GetStatsParams getStatsParams, onm onmVar) {
        t0c1 t0c1Var;
        if (onmVar instanceof t0c1) {
            t0c1Var = (t0c1) onmVar;
            int i = t0c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t0c1Var.c = i - Integer.MIN_VALUE;
            } else {
                t0c1Var = new t0c1(this, onmVar);
            }
        } else {
            t0c1Var = new t0c1(this, onmVar);
        }
        Object objCallSingle = t0c1Var.a;
        int i2 = t0c1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            t0c1Var.c = 1;
            objCallSingle = callSingle("spotify.storage.esperanto.proto.Storage", "GetStats", getStatsParams, t0c1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsStorage.Stats.r(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.storage.esperanto.proto.EsStorage.Stats: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    public php0 F0(PlaylistMembersRequest playlistMembersRequest) {
        return new php0(callStream("spotify.playlist_esperanto.proto.PlaylistService", "SubscribeToMembers", playlistMembersRequest), (byte) 27);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object G(EsAutomix$GetStylesForPresetIdRequest esAutomix$GetStylesForPresetIdRequest, onm onmVar) {
        w79 w79Var;
        if (onmVar instanceof w79) {
            w79Var = (w79) onmVar;
            int i = w79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w79Var.c = i - Integer.MIN_VALUE;
            } else {
                w79Var = new w79(this, onmVar);
            }
        } else {
            w79Var = new w79(this, onmVar);
        }
        Object objCallSingle = w79Var.a;
        int i2 = w79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            w79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetStylesForPresetId", esAutomix$GetStylesForPresetIdRequest, w79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetStylesForPresetIdResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetStylesForPresetIdResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object G0(ConnectMessages.TransferRequest transferRequest, onm onmVar) {
        f6l f6lVar;
        if (onmVar instanceof f6l) {
            f6lVar = (f6l) onmVar;
            int i = f6lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f6lVar.c = i - Integer.MIN_VALUE;
            } else {
                f6lVar = new f6l(this, onmVar);
            }
        } else {
            f6lVar = new f6l(this, onmVar);
        }
        Object objCallSingle = f6lVar.a;
        int i2 = f6lVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            f6lVar.c = 1;
            objCallSingle = callSingle("spotify.connect.esperanto.proto.ConnectService", "Transfer", transferRequest, f6lVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CommonMessages.StatusResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.CommonMessages.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object H(EsAutomix$GetVolumeStylesForVolumeStyleIdRequest esAutomix$GetVolumeStylesForVolumeStyleIdRequest, onm onmVar) {
        x79 x79Var;
        if (onmVar instanceof x79) {
            x79Var = (x79) onmVar;
            int i = x79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x79Var.c = i - Integer.MIN_VALUE;
            } else {
                x79Var = new x79(this, onmVar);
            }
        } else {
            x79Var = new x79(this, onmVar);
        }
        Object objCallSingle = x79Var.a;
        int i2 = x79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            x79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetVolumeStylesForVolumeStyleId", esAutomix$GetVolumeStylesForVolumeStyleIdRequest, x79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetVolumeStylesForVolumeStyleIdResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetVolumeStylesForVolumeStyleIdResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    public nwd H0(Empty empty) {
        return new nwd(callStream("spotify.connectivity.connection_quality.esperanto.proto.ConnectionQualityService", "listenToConnectionQualityEvents", empty), (byte) 27);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(Empty empty, onm onmVar) {
        jtu0 jtu0Var;
        if (onmVar instanceof jtu0) {
            jtu0Var = (jtu0) onmVar;
            int i = jtu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jtu0Var.c = i - Integer.MIN_VALUE;
            } else {
                jtu0Var = new jtu0(this, onmVar);
            }
        } else {
            jtu0Var = new jtu0(this, onmVar);
        }
        Object objCallSingle = jtu0Var.a;
        int i2 = jtu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            jtu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "InvalidateRevisions", empty, jtu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistInvalidateRevisionsResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistInvalidateRevisionsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I0(EsSessionTermination$TerminateSessionRequest esSessionTermination$TerminateSessionRequest, onm onmVar) {
        gi61 gi61Var;
        if (onmVar instanceof gi61) {
            gi61Var = (gi61) onmVar;
            int i = gi61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi61Var.c = i - Integer.MIN_VALUE;
            } else {
                gi61Var = new gi61(this, onmVar);
            }
        } else {
            gi61Var = new gi61(this, onmVar);
        }
        Object objCallSingle = gi61Var.a;
        int i2 = gi61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            gi61Var.c = 1;
            objCallSingle = callSingle("spotify.authenticated_sessions.session_termination.proto.SessionTermination", "terminateSession", esSessionTermination$TerminateSessionRequest, gi61Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsSessionTermination$TerminateSessionResult.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.authenticated_sessions.session_termination.proto.EsSessionTermination.TerminateSessionResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object J(CommonCappingOuterClass.IsCappedRequest isCappedRequest, onm onmVar) {
        crh crhVar;
        if (onmVar instanceof crh) {
            crhVar = (crh) onmVar;
            int i = crhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                crhVar.c = i - Integer.MIN_VALUE;
            } else {
                crhVar = new crh(this, onmVar);
            }
        } else {
            crhVar = new crh(this, onmVar);
        }
        Object objCallSingle = crhVar.a;
        int i2 = crhVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            crhVar.c = 1;
            objCallSingle = callSingle("spotify.common_capping.impl.common_capping_proto.CommonCapping", "IsCapped", isCappedRequest, crhVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CommonCappingOuterClass$IsCappedResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.common_capping.esperanto.proto.CommonCappingOuterClass.IsCappedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object K(ConnectMessages.LogoutRequest logoutRequest, onm onmVar) {
        z5l z5lVar;
        if (onmVar instanceof z5l) {
            z5lVar = (z5l) onmVar;
            int i = z5lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5lVar.c = i - Integer.MIN_VALUE;
            } else {
                z5lVar = new z5l(this, onmVar);
            }
        } else {
            z5lVar = new z5l(this, onmVar);
        }
        Object objCallSingle = z5lVar.a;
        int i2 = z5lVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            z5lVar.c = 1;
            objCallSingle = callSingle("spotify.connect.esperanto.proto.ConnectService", "Logout", logoutRequest, z5lVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CommonMessages.StatusResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.CommonMessages.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object L(ResumptionProgressEsperanto.MarkAsFinishedRequest markAsFinishedRequest, onm onmVar) {
        h831 h831Var;
        if (onmVar instanceof h831) {
            h831Var = (h831) onmVar;
            int i = h831Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h831Var.c = i - Integer.MIN_VALUE;
            } else {
                h831Var = new h831(this, onmVar);
            }
        } else {
            h831Var = new h831(this, onmVar);
        }
        Object objCallSingle = h831Var.a;
        int i2 = h831Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            h831Var.c = 1;
            objCallSingle = callSingle("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "MarkAsFinished", markAsFinishedRequest, h831Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ResumptionProgressEsperanto.MarkAsFinishedResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.MarkAsFinishedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object M(ResumptionProgressEsperanto.MarkAsNotStartedRequest markAsNotStartedRequest, onm onmVar) {
        i831 i831Var;
        if (onmVar instanceof i831) {
            i831Var = (i831) onmVar;
            int i = i831Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i831Var.c = i - Integer.MIN_VALUE;
            } else {
                i831Var = new i831(this, onmVar);
            }
        } else {
            i831Var = new i831(this, onmVar);
        }
        Object objCallSingle = i831Var.a;
        int i2 = i831Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            i831Var.c = 1;
            objCallSingle = callSingle("spotify.resumption_progress_esperanto.proto.ResumptionProgress", "MarkAsNotStarted", markAsNotStartedRequest, i831Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ResumptionProgressEsperanto.MarkAsNotStartedResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto.MarkAsNotStartedResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object N(PlaylistModificationRequest playlistModificationRequest, onm onmVar) {
        ktu0 ktu0Var;
        if (onmVar instanceof ktu0) {
            ktu0Var = (ktu0) onmVar;
            int i = ktu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ktu0Var.c = i - Integer.MIN_VALUE;
            } else {
                ktu0Var = new ktu0(this, onmVar);
            }
        } else {
            ktu0Var = new ktu0(this, onmVar);
        }
        Object objCallSingle = ktu0Var.a;
        int i2 = ktu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ktu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "Modify", playlistModificationRequest, ktu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistModificationResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistModificationResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object O(RootlistModificationRequest rootlistModificationRequest, onm onmVar) {
        kp31 kp31Var;
        if (onmVar instanceof kp31) {
            kp31Var = (kp31) onmVar;
            int i = kp31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp31Var.c = i - Integer.MIN_VALUE;
            } else {
                kp31Var = new kp31(this, onmVar);
            }
        } else {
            kp31Var = new kp31(this, onmVar);
        }
        Object objCallSingle = kp31Var.a;
        int i2 = kp31Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            kp31Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.RootlistModificationService", "Modify", rootlistModificationRequest, kp31Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return RootlistModificationResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.RootlistModificationResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object P(PlaylistMultiGetRequest playlistMultiGetRequest, onm onmVar) {
        pku0 pku0Var;
        if (onmVar instanceof pku0) {
            pku0Var = (pku0) onmVar;
            int i = pku0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pku0Var.c = i - Integer.MIN_VALUE;
            } else {
                pku0Var = new pku0(this, onmVar);
            }
        } else {
            pku0Var = new pku0(this, onmVar);
        }
        Object objCallSingle = pku0Var.a;
        int i2 = pku0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            pku0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistDataService", "MultiGet", playlistMultiGetRequest, pku0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistMultiGetResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistMultiGetResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Q(ConnectMessages.NotifyAudioRouteChangedRequest notifyAudioRouteChangedRequest, onm onmVar) {
        a6l a6lVar;
        if (onmVar instanceof a6l) {
            a6lVar = (a6l) onmVar;
            int i = a6lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a6lVar.c = i - Integer.MIN_VALUE;
            } else {
                a6lVar = new a6l(this, onmVar);
            }
        } else {
            a6lVar = new a6l(this, onmVar);
        }
        Object objCallSingle = a6lVar.a;
        int i2 = a6lVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            a6lVar.c = 1;
            objCallSingle = callSingle("spotify.connect.esperanto.proto.ConnectService", "NotifyAudioRouteChanged", notifyAudioRouteChangedRequest, a6lVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    public nwd R(CommonCappingOuterClass.ObserveCapStateChangedRequest observeCapStateChangedRequest) {
        return new nwd(callStream("spotify.common_capping.impl.common_capping_proto.CommonCapping", "ObserveCapStateChanged", observeCapStateChangedRequest), (byte) 15);
    }

    public php0 S(Empty empty) {
        return new php0(callStream("spotify.restrictions.permissions.permissions_proto.Permissions", "ObserveInvalidation", empty), (byte) 17);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object T(EsPause.PauseRequest pauseRequest, onm onmVar) {
        ekm ekmVar;
        if (onmVar instanceof ekm) {
            ekmVar = (ekm) onmVar;
            int i = ekmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekmVar.c = i - Integer.MIN_VALUE;
            } else {
                ekmVar = new ekm(this, onmVar);
            }
        } else {
            ekmVar = new ekm(this, onmVar);
        }
        Object objCallSingle = ekmVar.a;
        int i2 = ekmVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ekmVar.c = 1;
            objCallSingle = callSingle("spotify.player.esperanto.proto.ContextPlayer", "Pause", pauseRequest, ekmVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsResponseWithReasons.ResponseWithReasons.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object U(EsPlay.PlayRequest playRequest, onm onmVar) {
        fkm fkmVar;
        if (onmVar instanceof fkm) {
            fkmVar = (fkm) onmVar;
            int i = fkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fkmVar.c = i - Integer.MIN_VALUE;
            } else {
                fkmVar = new fkm(this, onmVar);
            }
        } else {
            fkmVar = new fkm(this, onmVar);
        }
        Object objCallSingle = fkmVar.a;
        int i2 = fkmVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            fkmVar.c = 1;
            objCallSingle = callSingle("spotify.player.esperanto.proto.ContextPlayer", "Play", playRequest, fkmVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsResponseWithReasons.ResponseWithReasons.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object V(PlaylistPlayRequest playlistPlayRequest, onm onmVar) {
        jqu0 jqu0Var;
        if (onmVar instanceof jqu0) {
            jqu0Var = (jqu0) onmVar;
            int i = jqu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqu0Var.c = i - Integer.MIN_VALUE;
            } else {
                jqu0Var = new jqu0(this, onmVar);
            }
        } else {
            jqu0Var = new jqu0(this, onmVar);
        }
        Object objCallSingle = jqu0Var.a;
        int i2 = jqu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            jqu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistPlayService", "Play", playlistPlayRequest, jqu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistPlayResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistPlayResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object W(PreviewRequest previewRequest, onm onmVar) {
        sfw0 sfw0Var;
        if (onmVar instanceof sfw0) {
            sfw0Var = (sfw0) onmVar;
            int i = sfw0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfw0Var.c = i - Integer.MIN_VALUE;
            } else {
                sfw0Var = new sfw0(this, onmVar);
            }
        } else {
            sfw0Var = new sfw0(this, onmVar);
        }
        Object objCallSingle = sfw0Var.a;
        int i2 = sfw0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            sfw0Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Preview", "Preview", previewRequest, sfw0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PreviewResponse.n(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.PreviewResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object X(ConnectMessages.PullRequest pullRequest, onm onmVar) {
        b6l b6lVar;
        if (onmVar instanceof b6l) {
            b6lVar = (b6l) onmVar;
            int i = b6lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b6lVar.c = i - Integer.MIN_VALUE;
            } else {
                b6lVar = new b6l(this, onmVar);
            }
        } else {
            b6lVar = new b6l(this, onmVar);
        }
        Object objCallSingle = b6lVar.a;
        int i2 = b6lVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            b6lVar.c = 1;
            objCallSingle = callSingle("spotify.connect.esperanto.proto.ConnectService", "Pull", pullRequest, b6lVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CommonMessages.StatusResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.CommonMessages.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Y(QueryRuntimeConsumptionRequest queryRuntimeConsumptionRequest, onm onmVar) {
        a141 a141Var;
        if (onmVar instanceof a141) {
            a141Var = (a141) onmVar;
            int i = a141Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a141Var.c = i - Integer.MIN_VALUE;
            } else {
                a141Var = new a141(this, onmVar);
            }
        } else {
            a141Var = new a141(this, onmVar);
        }
        Object objCallSingle = a141Var.a;
        int i2 = a141Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            a141Var.c = 1;
            objCallSingle = callSingle("spotify.runtime_consumption.esperanto.proto.RuntimeConsumptionService", "QueryRuntimeConsumption", queryRuntimeConsumptionRequest, a141Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return QueryRuntimeConsumptionResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.runtime_consumption.esperanto.proto.QueryRuntimeConsumptionResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object Z(ReadEndRequest readEndRequest, onm onmVar) {
        db01 db01Var;
        if (onmVar instanceof db01) {
            db01Var = (db01) onmVar;
            int i = db01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                db01Var.c = i - Integer.MIN_VALUE;
            } else {
                db01Var = new db01(this, onmVar);
            }
        } else {
            db01Var = new db01(this, onmVar);
        }
        Object objCallSingle = db01Var.a;
        int i2 = db01Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            db01Var.c = 1;
            objCallSingle = callSingle("spotify.read_reporting_esperanto.proto.ReadReportingService", "ReadEnd", readEndRequest, db01Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return StatusResponse.n(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.read_reporting_esperanto.proto.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(ConnectMessages.AddDeviceToGroupRequest addDeviceToGroupRequest, onm onmVar) {
        w5l w5lVar;
        if (onmVar instanceof w5l) {
            w5lVar = (w5l) onmVar;
            int i = w5lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5lVar.c = i - Integer.MIN_VALUE;
            } else {
                w5lVar = new w5l(this, onmVar);
            }
        } else {
            w5lVar = new w5l(this, onmVar);
        }
        Object objCallSingle = w5lVar.a;
        int i2 = w5lVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            w5lVar.c = 1;
            objCallSingle = callSingle("spotify.connect.esperanto.proto.ConnectService", "AddDeviceToGroup", addDeviceToGroupRequest, w5lVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ConnectMessages.AddDeviceToGroupResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.ConnectMessages.AddDeviceToGroupResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a0(ReadStartRequest readStartRequest, onm onmVar) {
        eb01 eb01Var;
        if (onmVar instanceof eb01) {
            eb01Var = (eb01) onmVar;
            int i = eb01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                eb01Var.c = i - Integer.MIN_VALUE;
            } else {
                eb01Var = new eb01(this, onmVar);
            }
        } else {
            eb01Var = new eb01(this, onmVar);
        }
        Object objCallSingle = eb01Var.a;
        int i2 = eb01Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            eb01Var.c = 1;
            objCallSingle = callSingle("spotify.read_reporting_esperanto.proto.ReadReportingService", "ReadStart", readStartRequest, eb01Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ReadStartResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.read_reporting_esperanto.proto.ReadStartResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(EsAutomix$AdjustTransitionRecipeForItemSpeedsRequest esAutomix$AdjustTransitionRecipeForItemSpeedsRequest, onm onmVar) {
        n79 n79Var;
        if (onmVar instanceof n79) {
            n79Var = (n79) onmVar;
            int i = n79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n79Var.c = i - Integer.MIN_VALUE;
            } else {
                n79Var = new n79(this, onmVar);
            }
        } else {
            n79Var = new n79(this, onmVar);
        }
        Object objCallSingle = n79Var.a;
        int i2 = n79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            n79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "AdjustTransitionRecipeForItemSpeeds", esAutomix$AdjustTransitionRecipeForItemSpeedsRequest, n79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$AdjustTransitionRecipeForItemSpeedsResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.AdjustTransitionRecipeForItemSpeedsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b0(ReadUpdateRequest readUpdateRequest, onm onmVar) {
        fb01 fb01Var;
        if (onmVar instanceof fb01) {
            fb01Var = (fb01) onmVar;
            int i = fb01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb01Var.c = i - Integer.MIN_VALUE;
            } else {
                fb01Var = new fb01(this, onmVar);
            }
        } else {
            fb01Var = new fb01(this, onmVar);
        }
        Object objCallSingle = fb01Var.a;
        int i2 = fb01Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            fb01Var.c = 1;
            objCallSingle = callSingle("spotify.read_reporting_esperanto.proto.ReadReportingService", "ReadUpdate", readUpdateRequest, fb01Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return StatusResponse.n(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.read_reporting_esperanto.proto.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(Empty empty, onm onmVar) {
        fns0 fns0Var;
        if (onmVar instanceof fns0) {
            fns0Var = (fns0) onmVar;
            int i = fns0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fns0Var.c = i - Integer.MIN_VALUE;
            } else {
                fns0Var = new fns0(this, onmVar);
            }
        } else {
            fns0Var = new fns0(this, onmVar);
        }
        Object objCallSingle = fns0Var.a;
        int i2 = fns0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            fns0Var.c = 1;
            objCallSingle = callSingle("spotify.restrictions.permissions.permissions_proto.Permissions", "CanAddToQueue", empty, fns0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PermissionsEsperanto.QueueQueryResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto.QueueQueryResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c0(CommonCappingOuterClass.RefreshRequest refreshRequest, onm onmVar) {
        erh erhVar;
        if (onmVar instanceof erh) {
            erhVar = (erh) onmVar;
            int i = erhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                erhVar.c = i - Integer.MIN_VALUE;
            } else {
                erhVar = new erh(this, onmVar);
            }
        } else {
            erhVar = new erh(this, onmVar);
        }
        Object objCallSingle = erhVar.a;
        int i2 = erhVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            erhVar.c = 1;
            objCallSingle = callSingle("spotify.common_capping.impl.common_capping_proto.CommonCapping", "Refresh", refreshRequest, erhVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(PermissionsEsperanto.CanPlayContentRequest canPlayContentRequest, onm onmVar) {
        gns0 gns0Var;
        if (onmVar instanceof gns0) {
            gns0Var = (gns0) onmVar;
            int i = gns0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gns0Var.c = i - Integer.MIN_VALUE;
            } else {
                gns0Var = new gns0(this, onmVar);
            }
        } else {
            gns0Var = new gns0(this, onmVar);
        }
        Object objCallSingle = gns0Var.a;
        int i2 = gns0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            gns0Var.c = 1;
            objCallSingle = callSingle("spotify.restrictions.permissions.permissions_proto.Permissions", "CanPlayContent", canPlayContentRequest, gns0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PermissionsEsperanto.CanPlayContentResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto.CanPlayContentResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d0(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest, onm onmVar) {
        v5h v5hVar;
        if (onmVar instanceof v5h) {
            v5hVar = (v5h) onmVar;
            int i = v5hVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v5hVar.c = i - Integer.MIN_VALUE;
            } else {
                v5hVar = new v5h(this, onmVar);
            }
        } else {
            v5hVar = new v5h(this, onmVar);
        }
        Object objCallSingle = v5hVar.a;
        int i2 = v5hVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            v5hVar.c = 1;
            objCallSingle = callSingle("spotify.collection_esperanto.proto.CollectionService", "Remove", collectionAddRemoveItemsRequest, v5hVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CollectionAddRemoveItemsResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionAddRemoveItemsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Empty empty, onm onmVar) {
        hns0 hns0Var;
        if (onmVar instanceof hns0) {
            hns0Var = (hns0) onmVar;
            int i = hns0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hns0Var.c = i - Integer.MIN_VALUE;
            } else {
                hns0Var = new hns0(this, onmVar);
            }
        } else {
            hns0Var = new hns0(this, onmVar);
        }
        Object objCallSingle = hns0Var.a;
        int i2 = hns0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            hns0Var.c = 1;
            objCallSingle = callSingle("spotify.restrictions.permissions.permissions_proto.Permissions", "CanSeeQueue", empty, hns0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PermissionsEsperanto.QueueQueryResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto.QueueQueryResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e0(ConnectMessages.RemoveDeviceFromGroupRequest removeDeviceFromGroupRequest, onm onmVar) {
        c6l c6lVar;
        if (onmVar instanceof c6l) {
            c6lVar = (c6l) onmVar;
            int i = c6lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c6lVar.c = i - Integer.MIN_VALUE;
            } else {
                c6lVar = new c6l(this, onmVar);
            }
        } else {
            c6lVar = new c6l(this, onmVar);
        }
        Object objCallSingle = c6lVar.a;
        int i2 = c6lVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            c6lVar.c = 1;
            objCallSingle = callSingle("spotify.connect.esperanto.proto.ConnectService", "RemoveDeviceFromGroup", removeDeviceFromGroupRequest, c6lVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ConnectMessages.RemoveDeviceFromGroupResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.ConnectMessages.RemoveDeviceFromGroupResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(Empty empty, onm onmVar) {
        ins0 ins0Var;
        if (onmVar instanceof ins0) {
            ins0Var = (ins0) onmVar;
            int i = ins0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ins0Var.c = i - Integer.MIN_VALUE;
            } else {
                ins0Var = new ins0(this, onmVar);
            }
        } else {
            ins0Var = new ins0(this, onmVar);
        }
        Object objCallSingle = ins0Var.a;
        int i2 = ins0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ins0Var.c = 1;
            objCallSingle = callSingle("spotify.restrictions.permissions.permissions_proto.Permissions", "CanSetQueue", empty, ins0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PermissionsEsperanto.QueueQueryResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto.QueueQueryResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f0(CommonCappingOuterClass.ReportConsumptionRequest reportConsumptionRequest, onm onmVar) {
        frh frhVar;
        if (onmVar instanceof frh) {
            frhVar = (frh) onmVar;
            int i = frhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                frhVar.c = i - Integer.MIN_VALUE;
            } else {
                frhVar = new frh(this, onmVar);
            }
        } else {
            frhVar = new frh(this, onmVar);
        }
        Object objCallSingle = frhVar.a;
        int i2 = frhVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            frhVar.c = 1;
            objCallSingle = callSingle("spotify.common_capping.impl.common_capping_proto.CommonCapping", "ReportConsumption", reportConsumptionRequest, frhVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(PlaylistClearTokenRequest playlistClearTokenRequest, onm onmVar) {
        dtu0 dtu0Var;
        if (onmVar instanceof dtu0) {
            dtu0Var = (dtu0) onmVar;
            int i = dtu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dtu0Var.c = i - Integer.MIN_VALUE;
            } else {
                dtu0Var = new dtu0(this, onmVar);
            }
        } else {
            dtu0Var = new dtu0(this, onmVar);
        }
        Object objCallSingle = dtu0Var.a;
        int i2 = dtu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            dtu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "ClearToken", playlistClearTokenRequest, dtu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistClearTokenResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistClearTokenResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g0(PlaylistLensRequest playlistLensRequest, onm onmVar) {
        ltu0 ltu0Var;
        if (onmVar instanceof ltu0) {
            ltu0Var = (ltu0) onmVar;
            int i = ltu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ltu0Var.c = i - Integer.MIN_VALUE;
            } else {
                ltu0Var = new ltu0(this, onmVar);
            }
        } else {
            ltu0Var = new ltu0(this, onmVar);
        }
        Object objCallSingle = ltu0Var.a;
        int i2 = ltu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ltu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "RequestLenses", playlistLensRequest, ltu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistLensResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistLensResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(Empty empty, onm onmVar) {
        x5l x5lVar;
        if (onmVar instanceof x5l) {
            x5lVar = (x5l) onmVar;
            int i = x5lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x5lVar.c = i - Integer.MIN_VALUE;
            } else {
                x5lVar = new x5l(this, onmVar);
            }
        } else {
            x5lVar = new x5l(this, onmVar);
        }
        Object objCallSingle = x5lVar.a;
        int i2 = x5lVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            x5lVar.c = 1;
            objCallSingle = callSingle("spotify.connect.esperanto.proto.ConnectService", "ClusterUpdateAfterBackendConnection", empty, x5lVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return ConnectMessages.ClusterUpdateAfterBackendConnectionResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.ConnectMessages.ClusterUpdateAfterBackendConnectionResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h0(EsResume.ResumeRequest resumeRequest, onm onmVar) {
        gkm gkmVar;
        if (onmVar instanceof gkm) {
            gkmVar = (gkm) onmVar;
            int i = gkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkmVar.c = i - Integer.MIN_VALUE;
            } else {
                gkmVar = new gkm(this, onmVar);
            }
        } else {
            gkmVar = new gkm(this, onmVar);
        }
        Object objCallSingle = gkmVar.a;
        int i2 = gkmVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            gkmVar.c = 1;
            objCallSingle = callSingle("spotify.player.esperanto.proto.ContextPlayer", "Resume", resumeRequest, gkmVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsResponseWithReasons.ResponseWithReasons.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(CollectionContainsRequest collectionContainsRequest, onm onmVar) {
        t5h t5hVar;
        if (onmVar instanceof t5h) {
            t5hVar = (t5h) onmVar;
            int i = t5hVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t5hVar.c = i - Integer.MIN_VALUE;
            } else {
                t5hVar = new t5h(this, onmVar);
            }
        } else {
            t5hVar = new t5h(this, onmVar);
        }
        Object objCallSingle = t5hVar.a;
        int i2 = t5hVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            t5hVar.c = 1;
            objCallSingle = callSingle("spotify.collection_esperanto.proto.CollectionService", "Contains", collectionContainsRequest, t5hVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CollectionContainsResponse.r(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionContainsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i0(SyncRequest syncRequest, onm onmVar) {
        mtu0 mtu0Var;
        if (onmVar instanceof mtu0) {
            mtu0Var = (mtu0) onmVar;
            int i = mtu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtu0Var.c = i - Integer.MIN_VALUE;
            } else {
                mtu0Var = new mtu0(this, onmVar);
            }
        } else {
            mtu0Var = new mtu0(this, onmVar);
        }
        Object objCallSingle = mtu0Var.a;
        int i2 = mtu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            mtu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "Resync", syncRequest, mtu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistResyncResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistResyncResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(PlaylistContainsRequest playlistContainsRequest, onm onmVar) {
        etu0 etu0Var;
        if (onmVar instanceof etu0) {
            etu0Var = (etu0) onmVar;
            int i = etu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                etu0Var.c = i - Integer.MIN_VALUE;
            } else {
                etu0Var = new etu0(this, onmVar);
            }
        } else {
            etu0Var = new etu0(this, onmVar);
        }
        Object objCallSingle = etu0Var.a;
        int i2 = etu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            etu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "Contains", playlistContainsRequest, etu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistContainsResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistContainsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j0(LocalListConfigSaveRequest localListConfigSaveRequest, onm onmVar) {
        mfe0 mfe0Var;
        if (onmVar instanceof mfe0) {
            mfe0Var = (mfe0) onmVar;
            int i = mfe0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfe0Var.c = i - Integer.MIN_VALUE;
            } else {
                mfe0Var = new mfe0(this, onmVar);
            }
        } else {
            mfe0Var = new mfe0(this, onmVar);
        }
        Object objCallSingle = mfe0Var.a;
        int i2 = mfe0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            mfe0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist.local_list_config_esperanto.proto.LocalListConfigService", "Save", localListConfigSaveRequest, mfe0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return LocalListConfigSaveResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.local_list_config_esperanto.proto.LocalListConfigSaveResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(CopyRequest copyRequest, onm onmVar) {
        ftu0 ftu0Var;
        if (onmVar instanceof ftu0) {
            ftu0Var = (ftu0) onmVar;
            int i = ftu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ftu0Var.c = i - Integer.MIN_VALUE;
            } else {
                ftu0Var = new ftu0(this, onmVar);
            }
        } else {
            ftu0Var = new ftu0(this, onmVar);
        }
        Object objCallSingle = ftu0Var.a;
        int i2 = ftu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ftu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "Copy", copyRequest, ftu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CopyResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.CopyResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k0(EsSeekTo.SeekToRequest seekToRequest, onm onmVar) {
        hkm hkmVar;
        if (onmVar instanceof hkm) {
            hkmVar = (hkm) onmVar;
            int i = hkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hkmVar.c = i - Integer.MIN_VALUE;
            } else {
                hkmVar = new hkm(this, onmVar);
            }
        } else {
            hkmVar = new hkm(this, onmVar);
        }
        Object objCallSingle = hkmVar.a;
        int i2 = hkmVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            hkmVar.c = 1;
            objCallSingle = callSingle("spotify.player.esperanto.proto.ContextPlayer", "SeekTo", seekToRequest, hkmVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsResponseWithReasons.ResponseWithReasons.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(CollectionDecorateRequest collectionDecorateRequest, onm onmVar) {
        u5h u5hVar;
        if (onmVar instanceof u5h) {
            u5hVar = (u5h) onmVar;
            int i = u5hVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5hVar.c = i - Integer.MIN_VALUE;
            } else {
                u5hVar = new u5h(this, onmVar);
            }
        } else {
            u5hVar = new u5h(this, onmVar);
        }
        Object objCallSingle = u5hVar.a;
        int i2 = u5hVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            u5hVar.c = 1;
            objCallSingle = callSingle("spotify.collection_esperanto.proto.CollectionService", "Decorate", collectionDecorateRequest, u5hVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CollectionDecorateResponse.u(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionDecorateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l0(ActionRequest actionRequest, onm onmVar) {
        l9r l9rVar;
        if (onmVar instanceof l9r) {
            l9rVar = (l9r) onmVar;
            int i = l9rVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l9rVar.c = i - Integer.MIN_VALUE;
            } else {
                l9rVar = new l9r(this, onmVar);
            }
        } else {
            l9rVar = new l9r(this, onmVar);
        }
        Object objCallSingle = l9rVar.a;
        int i2 = l9rVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            l9rVar.c = 1;
            objCallSingle = callSingle("spotify.decipher.esperanto.proto.DecipherService", "SendAction", actionRequest, l9rVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(EsStorage.DeleteUnlockedItemsParams deleteUnlockedItemsParams, onm onmVar) {
        r0c1 r0c1Var;
        if (onmVar instanceof r0c1) {
            r0c1Var = (r0c1) onmVar;
            int i = r0c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0c1Var.c = i - Integer.MIN_VALUE;
            } else {
                r0c1Var = new r0c1(this, onmVar);
            }
        } else {
            r0c1Var = new r0c1(this, onmVar);
        }
        Object objCallSingle = r0c1Var.a;
        int i2 = r0c1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            r0c1Var.c = 1;
            objCallSingle = callSingle("spotify.storage.esperanto.proto.Storage", "DeleteUnlockedItems", deleteUnlockedItemsParams, r0c1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m0(ClientSideEventRequest clientSideEventRequest, onm onmVar) {
        m9r m9rVar;
        if (onmVar instanceof m9r) {
            m9rVar = (m9r) onmVar;
            int i = m9rVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m9rVar.c = i - Integer.MIN_VALUE;
            } else {
                m9rVar = new m9r(this, onmVar);
            }
        } else {
            m9rVar = new m9r(this, onmVar);
        }
        Object objCallSingle = m9rVar.a;
        int i2 = m9rVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            m9rVar.c = 1;
            objCallSingle = callSingle("spotify.decipher.esperanto.proto.DecipherService", "SendEvent", clientSideEventRequest, m9rVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(PlaylistMultiItemSignalRequest playlistMultiItemSignalRequest, onm onmVar) {
        gtu0 gtu0Var;
        if (onmVar instanceof gtu0) {
            gtu0Var = (gtu0) onmVar;
            int i = gtu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gtu0Var.c = i - Integer.MIN_VALUE;
            } else {
                gtu0Var = new gtu0(this, onmVar);
            }
        } else {
            gtu0Var = new gtu0(this, onmVar);
        }
        Object objCallSingle = gtu0Var.a;
        int i2 = gtu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            gtu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "EmitItemSignals", playlistMultiItemSignalRequest, gtu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistItemSignalResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistItemSignalResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n0(PermissionsEsperanto.SetBYOMRestrictionRequest setBYOMRestrictionRequest, onm onmVar) {
        lns0 lns0Var;
        if (onmVar instanceof lns0) {
            lns0Var = (lns0) onmVar;
            int i = lns0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lns0Var.c = i - Integer.MIN_VALUE;
            } else {
                lns0Var = new lns0(this, onmVar);
            }
        } else {
            lns0Var = new lns0(this, onmVar);
        }
        Object objCallSingle = lns0Var.a;
        int i2 = lns0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            lns0Var.c = 1;
            objCallSingle = callSingle("spotify.restrictions.permissions.permissions_proto.Permissions", "SetBYOMRestriction", setBYOMRestrictionRequest, lns0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PermissionsEsperanto.SetBYOMRestrictionResponse.n(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto.SetBYOMRestrictionResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(PlaylistMultiSignalRequest playlistMultiSignalRequest, onm onmVar) {
        htu0 htu0Var;
        if (onmVar instanceof htu0) {
            htu0Var = (htu0) onmVar;
            int i = htu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htu0Var.c = i - Integer.MIN_VALUE;
            } else {
                htu0Var = new htu0(this, onmVar);
            }
        } else {
            htu0Var = new htu0(this, onmVar);
        }
        Object objCallSingle = htu0Var.a;
        int i2 = htu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            htu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "EmitSignals", playlistMultiSignalRequest, htu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistSignalResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistSignalResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o0(PlaylistSetBasePermissionRequest playlistSetBasePermissionRequest, onm onmVar) {
        ntu0 ntu0Var;
        if (onmVar instanceof ntu0) {
            ntu0Var = (ntu0) onmVar;
            int i = ntu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ntu0Var.c = i - Integer.MIN_VALUE;
            } else {
                ntu0Var = new ntu0(this, onmVar);
            }
        } else {
            ntu0Var = new ntu0(this, onmVar);
        }
        Object objCallSingle = ntu0Var.a;
        int i2 = ntu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ntu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "SetBasePermission", playlistSetBasePermissionRequest, ntu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistSetBasePermissionResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistSetBasePermissionResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(PlaylistFindRequest playlistFindRequest, onm onmVar) {
        nku0 nku0Var;
        if (onmVar instanceof nku0) {
            nku0Var = (nku0) onmVar;
            int i = nku0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nku0Var.c = i - Integer.MIN_VALUE;
            } else {
                nku0Var = new nku0(this, onmVar);
            }
        } else {
            nku0Var = new nku0(this, onmVar);
        }
        Object objCallSingle = nku0Var.a;
        int i2 = nku0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            nku0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistDataService", "Find", playlistFindRequest, nku0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistFindResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistFindResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p0(EsStorage.SetCacheSizeLimitParams setCacheSizeLimitParams, onm onmVar) {
        u0c1 u0c1Var;
        if (onmVar instanceof u0c1) {
            u0c1Var = (u0c1) onmVar;
            int i = u0c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u0c1Var.c = i - Integer.MIN_VALUE;
            } else {
                u0c1Var = new u0c1(this, onmVar);
            }
        } else {
            u0c1Var = new u0c1(this, onmVar);
        }
        Object objCallSingle = u0c1Var.a;
        int i2 = u0c1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            u0c1Var.c = 1;
            objCallSingle = callSingle("spotify.storage.esperanto.proto.Storage", "SetCacheSizeLimit", setCacheSizeLimitParams, u0c1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(PlaylistGetRequest playlistGetRequest, onm onmVar) {
        oku0 oku0Var;
        if (onmVar instanceof oku0) {
            oku0Var = (oku0) onmVar;
            int i = oku0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oku0Var.c = i - Integer.MIN_VALUE;
            } else {
                oku0Var = new oku0(this, onmVar);
            }
        } else {
            oku0Var = new oku0(this, onmVar);
        }
        Object objCallSingle = oku0Var.a;
        int i2 = oku0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            oku0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistDataService", "Get", playlistGetRequest, oku0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistGetResponse.s(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistGetResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q0(SetMemberPermissionRequest setMemberPermissionRequest, onm onmVar) {
        otu0 otu0Var;
        if (onmVar instanceof otu0) {
            otu0Var = (otu0) onmVar;
            int i = otu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                otu0Var.c = i - Integer.MIN_VALUE;
            } else {
                otu0Var = new otu0(this, onmVar);
            }
        } else {
            otu0Var = new otu0(this, onmVar);
        }
        Object objCallSingle = otu0Var.a;
        int i2 = otu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            otu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "SetMemberPermission", setMemberPermissionRequest, otu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistSetMemberPermissionResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistSetMemberPermissionResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(Empty empty, onm onmVar) {
        o79 o79Var;
        if (onmVar instanceof o79) {
            o79Var = (o79) onmVar;
            int i = o79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o79Var.c = i - Integer.MIN_VALUE;
            } else {
                o79Var = new o79(this, onmVar);
            }
        } else {
            o79Var = new o79(this, onmVar);
        }
        Object objCallSingle = o79Var.a;
        int i2 = o79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            o79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetBeatmatchOptOutTransitionDuration", empty, o79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetBeatmatchOptOutTransitionDurationResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetBeatmatchOptOutTransitionDurationResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r0(PlaylistOfflineRequest playlistOfflineRequest, onm onmVar) {
        ptu0 ptu0Var;
        if (onmVar instanceof ptu0) {
            ptu0Var = (ptu0) onmVar;
            int i = ptu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ptu0Var.c = i - Integer.MIN_VALUE;
            } else {
                ptu0Var = new ptu0(this, onmVar);
            }
        } else {
            ptu0Var = new ptu0(this, onmVar);
        }
        Object objCallSingle = ptu0Var.a;
        int i2 = ptu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ptu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "SetOfflineState", playlistOfflineRequest, ptu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistOfflineResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistOfflineResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(EsStorage.GetCacheSizeLimitParams getCacheSizeLimitParams, onm onmVar) {
        s0c1 s0c1Var;
        if (onmVar instanceof s0c1) {
            s0c1Var = (s0c1) onmVar;
            int i = s0c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s0c1Var.c = i - Integer.MIN_VALUE;
            } else {
                s0c1Var = new s0c1(this, onmVar);
            }
        } else {
            s0c1Var = new s0c1(this, onmVar);
        }
        Object objCallSingle = s0c1Var.a;
        int i2 = s0c1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            s0c1Var.c = 1;
            objCallSingle = callSingle("spotify.storage.esperanto.proto.Storage", "GetCacheSizeLimit", getCacheSizeLimitParams, s0c1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsStorage.CacheSizeLimit.s(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.storage.esperanto.proto.EsStorage.CacheSizeLimit: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s0(ConnectMessages.SetPreferredIncarnationRequest setPreferredIncarnationRequest, onm onmVar) {
        d6l d6lVar;
        if (onmVar instanceof d6l) {
            d6lVar = (d6l) onmVar;
            int i = d6lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d6lVar.c = i - Integer.MIN_VALUE;
            } else {
                d6lVar = new d6l(this, onmVar);
            }
        } else {
            d6lVar = new d6l(this, onmVar);
        }
        Object objCallSingle = d6lVar.a;
        int i2 = d6lVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            d6lVar.c = 1;
            objCallSingle = callSingle("spotify.connect.esperanto.proto.ConnectService", "SetPreferredIncarnation", setPreferredIncarnationRequest, d6lVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return CommonMessages.StatusResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.connect.esperanto.proto.CommonMessages.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(EsAutomix$GetComputedTransitionsRequest esAutomix$GetComputedTransitionsRequest, onm onmVar) {
        p79 p79Var;
        if (onmVar instanceof p79) {
            p79Var = (p79) onmVar;
            int i = p79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p79Var.c = i - Integer.MIN_VALUE;
            } else {
                p79Var = new p79(this, onmVar);
            }
        } else {
            p79Var = new p79(this, onmVar);
        }
        Object objCallSingle = p79Var.a;
        int i2 = p79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            p79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetComputedTransitions", esAutomix$GetComputedTransitionsRequest, p79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetComputedTransitionsResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetComputedTransitionsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t0(PlaylistSetTokenRequest playlistSetTokenRequest, onm onmVar) {
        qtu0 qtu0Var;
        if (onmVar instanceof qtu0) {
            qtu0Var = (qtu0) onmVar;
            int i = qtu0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qtu0Var.c = i - Integer.MIN_VALUE;
            } else {
                qtu0Var = new qtu0(this, onmVar);
            }
        } else {
            qtu0Var = new qtu0(this, onmVar);
        }
        Object objCallSingle = qtu0Var.a;
        int i2 = qtu0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            qtu0Var.c = 1;
            objCallSingle = callSingle("spotify.playlist_esperanto.proto.PlaylistService", "SetToken", playlistSetTokenRequest, qtu0Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return PlaylistSetTokenResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.playlist.esperanto.proto.PlaylistSetTokenResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(GetConsumptionRecordsRequest getConsumptionRecordsRequest, onm onmVar) {
        z041 z041Var;
        if (onmVar instanceof z041) {
            z041Var = (z041) onmVar;
            int i = z041Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z041Var.c = i - Integer.MIN_VALUE;
            } else {
                z041Var = new z041(this, onmVar);
            }
        } else {
            z041Var = new z041(this, onmVar);
        }
        Object objCallSingle = z041Var.a;
        int i2 = z041Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            z041Var.c = 1;
            objCallSingle = callSingle("spotify.runtime_consumption.esperanto.proto.RuntimeConsumptionService", "GetConsumptionRecords", getConsumptionRecordsRequest, z041Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return GetConsumptionRecordsResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.runtime_consumption.esperanto.proto.GetConsumptionRecordsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u0(EsSignalRequest.SignalRequest signalRequest, onm onmVar) {
        ikm ikmVar;
        if (onmVar instanceof ikm) {
            ikmVar = (ikm) onmVar;
            int i = ikmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikmVar.c = i - Integer.MIN_VALUE;
            } else {
                ikmVar = new ikm(this, onmVar);
            }
        } else {
            ikmVar = new ikm(this, onmVar);
        }
        Object objCallSingle = ikmVar.a;
        int i2 = ikmVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ikmVar.c = 1;
            objCallSingle = callSingle("spotify.player.esperanto.proto.ContextPlayer", "Signal", signalRequest, ikmVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsResponseWithReasons.ResponseWithReasons.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(EsAutomix$GetEqStylesForEqStyleIdRequest esAutomix$GetEqStylesForEqStyleIdRequest, onm onmVar) {
        q79 q79Var;
        if (onmVar instanceof q79) {
            q79Var = (q79) onmVar;
            int i = q79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q79Var.c = i - Integer.MIN_VALUE;
            } else {
                q79Var = new q79(this, onmVar);
            }
        } else {
            q79Var = new q79(this, onmVar);
        }
        Object objCallSingle = q79Var.a;
        int i2 = q79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            q79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetEqStylesForEqStyleId", esAutomix$GetEqStylesForEqStyleIdRequest, q79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetEqStylesForEqStyleIdResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetEqStylesForEqStyleIdResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v0(EsSkipNext.SkipNextRequest skipNextRequest, onm onmVar) {
        jkm jkmVar;
        if (onmVar instanceof jkm) {
            jkmVar = (jkm) onmVar;
            int i = jkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkmVar.c = i - Integer.MIN_VALUE;
            } else {
                jkmVar = new jkm(this, onmVar);
            }
        } else {
            jkmVar = new jkm(this, onmVar);
        }
        Object objCallSingle = jkmVar.a;
        int i2 = jkmVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            jkmVar.c = 1;
            objCallSingle = callSingle("spotify.player.esperanto.proto.ContextPlayer", "SkipNext", skipNextRequest, jkmVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsResponseWithReasons.ResponseWithReasons.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(EsAutomix$GetFilterFxStylesForFilterFxStyleIdRequest esAutomix$GetFilterFxStylesForFilterFxStyleIdRequest, onm onmVar) {
        r79 r79Var;
        if (onmVar instanceof r79) {
            r79Var = (r79) onmVar;
            int i = r79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r79Var.c = i - Integer.MIN_VALUE;
            } else {
                r79Var = new r79(this, onmVar);
            }
        } else {
            r79Var = new r79(this, onmVar);
        }
        Object objCallSingle = r79Var.a;
        int i2 = r79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            r79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetFilterFxStylesForFilterFxStyleId", esAutomix$GetFilterFxStylesForFilterFxStyleIdRequest, r79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetFilterFxStylesForFilterFxStyleIdResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetFilterFxStylesForFilterFxStyleIdResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w0(AtvRemoteServiceOuterClass$AtvStartPairingRequest atvRemoteServiceOuterClass$AtvStartPairingRequest, onm onmVar) {
        gn7 gn7Var;
        if (onmVar instanceof gn7) {
            gn7Var = (gn7) onmVar;
            int i = gn7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gn7Var.c = i - Integer.MIN_VALUE;
            } else {
                gn7Var = new gn7(this, onmVar);
            }
        } else {
            gn7Var = new gn7(this, onmVar);
        }
        Object objCallSingle = gn7Var.a;
        int i2 = gn7Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            gn7Var.c = 1;
            objCallSingle = callSingle("spotify.atv_remote.esperanto.proto.AtvRemoteService", "StartPairing", atvRemoteServiceOuterClass$AtvStartPairingRequest, gn7Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return AtvRemoteServiceOuterClass$AtvPairingResponse.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.atv_remote.esperanto.proto.AtvRemoteServiceOuterClass.AtvPairingResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(EsAutomix$GetFxStylesForFxStyleIdRequest esAutomix$GetFxStylesForFxStyleIdRequest, onm onmVar) {
        s79 s79Var;
        if (onmVar instanceof s79) {
            s79Var = (s79) onmVar;
            int i = s79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s79Var.c = i - Integer.MIN_VALUE;
            } else {
                s79Var = new s79(this, onmVar);
            }
        } else {
            s79Var = new s79(this, onmVar);
        }
        Object objCallSingle = s79Var.a;
        int i2 = s79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            s79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetFxStylesForFxStyleId", esAutomix$GetFxStylesForFxStyleIdRequest, s79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetFxStylesForFxStyleIdResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetFxStylesForFxStyleIdResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    public nwd x0(ConnectMessages.StateRequest stateRequest) {
        return new nwd(callStream("spotify.connect.esperanto.proto.ConnectService", "State", stateRequest), (byte) 25);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(EsAutomix$GetJogwheelBlocksRequest esAutomix$GetJogwheelBlocksRequest, onm onmVar) {
        t79 t79Var;
        if (onmVar instanceof t79) {
            t79Var = (t79) onmVar;
            int i = t79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t79Var.c = i - Integer.MIN_VALUE;
            } else {
                t79Var = new t79(this, onmVar);
            }
        } else {
            t79Var = new t79(this, onmVar);
        }
        Object objCallSingle = t79Var.a;
        int i2 = t79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            t79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetJogwheelBlocks", esAutomix$GetJogwheelBlocksRequest, t79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetJogwheelBlocksResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetJogwheelBlocksResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y0(EsStop.StopRequest stopRequest, onm onmVar) {
        kkm kkmVar;
        if (onmVar instanceof kkm) {
            kkmVar = (kkm) onmVar;
            int i = kkmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kkmVar.c = i - Integer.MIN_VALUE;
            } else {
                kkmVar = new kkm(this, onmVar);
            }
        } else {
            kkmVar = new kkm(this, onmVar);
        }
        Object objCallSingle = kkmVar.a;
        int i2 = kkmVar.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            kkmVar.c = 1;
            objCallSingle = callSingle("spotify.player.esperanto.proto.ContextPlayer", "Stop", stopRequest, kkmVar);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsResponseWithReasons.ResponseWithReasons.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(EsAutomix$GetLoopingBlocksRequest esAutomix$GetLoopingBlocksRequest, onm onmVar) {
        u79 u79Var;
        if (onmVar instanceof u79) {
            u79Var = (u79) onmVar;
            int i = u79Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                u79Var.c = i - Integer.MIN_VALUE;
            } else {
                u79Var = new u79(this, onmVar);
            }
        } else {
            u79Var = new u79(this, onmVar);
        }
        Object objCallSingle = u79Var.a;
        int i2 = u79Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            u79Var.c = 1;
            objCallSingle = callSingle("spotify.automix.esperanto.proto.Automix", "GetLoopingBlocks", esAutomix$GetLoopingBlocksRequest, u79Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return EsAutomix$GetLoopingBlocksResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.automix.esperanto.proto.EsAutomix.GetLoopingBlocksResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z0(StreamEndRequestOuterClass.StreamEndRequest streamEndRequest, onm onmVar) {
        iec1 iec1Var;
        if (onmVar instanceof iec1) {
            iec1Var = (iec1) onmVar;
            int i = iec1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iec1Var.c = i - Integer.MIN_VALUE;
            } else {
                iec1Var = new iec1(this, onmVar);
            }
        } else {
            iec1Var = new iec1(this, onmVar);
        }
        Object objCallSingle = iec1Var.a;
        int i2 = iec1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            iec1Var.c = 1;
            objCallSingle = callSingle("spotify.stream_reporting_esperanto.proto.StreamReportingService", "StreamEnd", streamEndRequest, iec1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return StatusResponseOuterClass.StatusResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass.StatusResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
